/*******************************************************************************
 *
 * C O P Y R I G H T    N O T I C E
 *  (c) Copyright 2006
 *  Shared Marketing Services, Inc. 
 *  444 N. Michigan Ave
 *  Chicago, Illinois 60611
 *
 *      All Rights Reserved.
 *      No portions of this source code or the resulting compiled
 *      program may be used without express written consent and licensing
 *      by Shared Marketing Services, Inc. 
 *******************************************************************************/
package com.sharedmarketing.bck.template.csr.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.log4j.Category;

import com.adivi.adkit.common.beans.UserInfo;
import com.sharedmarketing.bck.addepot.beans.NavLink;
import com.sharedmarketing.bck.addepot.util.AdDepotUtil;

/**
 * 
 * @author bmurphy
 *  This class was originally intended to be a singleton to prevent multiple instances of the menu object occurring
 *  but due to the nature of struts only one menu was being produced across all sessions. I left it as a wrapper
 *  class to encapsulate the menu generation code. A single instance of the menu object is placed into session and the 
 *  build menu method is only called if the csrMenu attribute is not present in session.
 *   
 */
public class CreateMenuAction {

    private static CreateMenuAction _instanceMenu;
    private static List<NavLink> menu;
    private static final Category LOG = Category.getInstance(CreateMenuAction.class);

    @SuppressWarnings("unchecked")
    private CreateMenuAction(final String position, final UserInfo userInfo, final Locale userLocale) {
        setMenu(buildMenuObject(position, userInfo, userLocale));
    }

    public static synchronized CreateMenuAction getInstance(final String position,
            final UserInfo userInfo, final Locale userLocale) {

        _instanceMenu = new CreateMenuAction(position, userInfo, userLocale);

        return _instanceMenu;
    }

    private List getTopMenuItems(final String position, final UserInfo userInfo,
            final Locale userLocale) {
        List<NavLink> topMenu;

        topMenu = AdDepotUtil.getSortedNavLinks(position, userInfo, userLocale);

        return topMenu;
    }

    private List getSubMenuItems(final String position, final UserInfo userInfo,
            final Locale userLocale) {
        List<NavLink> subMenu;

        subMenu = AdDepotUtil.getSortedSubNavLinks(position, userInfo, userLocale);

        return subMenu;
    }

    private List<NavLink> buildMenuObject(final String position, final UserInfo userInfo,
            final Locale userLocale) {
        List<NavLink> menu = new ArrayList<NavLink>();
        List<NavLink> topMenuItems;
        List<NavLink> subMenuItems;
        topMenuItems = getTopMenuItems(position, userInfo, userLocale);
        subMenuItems = getSubMenuItems(position, userInfo, userLocale);

        for (NavLink topMenuItem : topMenuItems) {
            List<NavLink> subMenu = new ArrayList<NavLink>();
            for (NavLink subMenuItem : subMenuItems) {
                if (subMenuItem.getRootNavlink() != null) {
                    if (subMenuItem.getRootNavlink().compareTo(topMenuItem.getID()) == 0) {
                        subMenu.add(subMenuItem);
                    }
                }
            }
            topMenuItem.setChildren(subMenu);
            menu.add(topMenuItem);
        }

        return menu;
    }

    public static List<NavLink> getMenu() {
        return menu;
    }

    public static void setMenu(List<NavLink> menu) {
        CreateMenuAction.menu = menu;
    }
}