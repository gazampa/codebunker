package com.sharedmarketing.bck.template.actions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.language.Soundex;
import org.apache.log4j.Category;

import com.adivi.adkit.common.beans.UserInfo;
import com.adivi.adkit.common.utility.BckUtil;
import com.adivi.adkit.common.utility.JSPConstants;
import com.adivi.adkit.tempman.beans.TemplateHeaderJSPBean;
import com.sharedmarketing.bck.template.dao.TemplateDAO;
import com.sms.framework.common.beans.ActionResult;
import com.sms.framework.servlet.GeneralServlet;
import com.sms.framework.utility.Action;
import com.sms.framework.utility.Constants;
import com.sms.framework.utility.DBException;
import com.sms.framework.utility.Error;
import com.sms.framework.utility.ErrorCollection;
import com.sms.framework.utility.ErrorConstants;
import com.sms.framework.utility.Util;

public class SoundexSearchV2Action implements Action {
    static Category LOG = Category.getInstance(SoundexSearchV2Action.class.getName());
    static private Soundex soundexInstance = new Soundex();

    public SoundexSearchV2Action() {
    }

    @SuppressWarnings("unchecked")
    public ActionResult perform(GeneralServlet servlet, HttpServletRequest request,
            HttpServletResponse response) {
        LOG.debug("*************************** SoundexSearchAction ***************************");
        ActionResult result = new ActionResult();
        com.sms.framework.utility.Error error = new com.sms.framework.utility.Error();
        ErrorCollection errorCollection = new ErrorCollection();
        HttpSession session = request.getSession(false);
        Locale clientLocale = BckUtil.getClientLocale(request);
        UserInfo userInfo = (UserInfo)session.getAttribute(Constants.USER_INFO_BEAN);

        if (soundexInstance == null) {
            soundexInstance = new Soundex();
        }

        ArrayList<TemplateHeaderJSPBean> fullList = null;
        HashSet<BigDecimal> templateList = new HashSet<BigDecimal>();
        TemplateHeaderJSPBean templateHeaderBean = null;
        ArrayList<TemplateHeaderJSPBean> templateHeaders = new ArrayList<TemplateHeaderJSPBean>();
        TemplateHeaderJSPBean[] templateHeadersJSP = null;

        String searchField = request.getParameter("search");
        String pattern = soundexInstance.soundex(searchField);

        if (Util.stringTest(searchField)) {
            try {
                fullList = new ArrayList<TemplateHeaderJSPBean>(TemplateDAO.getTemplateList(
                        userInfo.getClientID(), clientLocale));
                for (TemplateHeaderJSPBean template : fullList) {
                    String comments = template.getTemplateComments();
                    String name = template.getTemplateName();
                    comments = comments.replace("_", " ");
                    name = name.replace("_", " ");
                    if (comments != null) {
                        String[] splitComments = comments.split(" ");

                        for (int i = 0; i < splitComments.length; i++) {
                            String word = splitComments[i];
                            String soundexWord = soundexInstance.soundex(word);
                            if (soundexWord.equals(pattern) && Util.stringTest(pattern)) {
                                templateList.add(template.getTemplateId());
                            }
                        }
                    }

                    if (name != null) {
                        String[] splitName = name.split(" ");

                        for (int i = 0; i < splitName.length; i++) {
                            String word = splitName[i];
                            String soundexWord = soundexInstance.soundex(word);
                            if (soundexWord.equals(pattern) && Util.stringTest(pattern)) {
                                templateList.add(template.getTemplateId());
                            }
                        }
                    }
                }
                /*            templateList = (HashSet)TemplateDAO.getSoundexSearch(searchField,
                                    userInfo.getClientID()); */
                LOG.debug("Template Ids returned from Soundex Search : " + templateList.toString());
                Iterator iterator = templateList.iterator();
                while (iterator.hasNext()) {
                    BigDecimal templateId = (BigDecimal)iterator.next();
                    templateHeaderBean = (TemplateDAO.getTemplateHeaderBean(templateId, userInfo,
                            clientLocale));
                    templateHeaders.add(templateHeaderBean);
                }
            } catch (DBException sae) {
                error = new Error(ErrorConstants.DATABASE_ERROR, sae.toString());
                errorCollection.put(ErrorConstants.DATABASE_ERROR, error);
            }
        }

        if (templateHeaders != null) {
            templateHeadersJSP = templateHeaders.toArray(new TemplateHeaderJSPBean[templateHeaders.size()]);
        }

        if (templateHeadersJSP != null) {
            LOG.debug("Adding templateheaderbean to session : " + templateHeadersJSP.toString());
            session.setAttribute("templateheaderbean", templateHeadersJSP);
        }

        if (Util.stringTest(searchField)) {
            result.setResult(JSPConstants.NEW_TEMPLATE);
        } else {
            new TemplateHomeAction().perform(servlet, request, response);
            result.setResult(JSPConstants.ADDEPOT_HOME_TEMPLATES);
        }

        result.setResultType(Constants.JSP_RESULT);
        return result;
    }
}