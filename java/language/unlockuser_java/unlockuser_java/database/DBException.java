package database;

import java.sql.SQLException;

@SuppressWarnings("serial")
public class DBException extends SQLException {

    private String mSQLStatement;
    private int errorCode;

    public DBException() {
        super();
    }

    public DBException(String pMsg) {
        super(pMsg);
    }

    public void setSQLStatement(String pStatement) {
        mSQLStatement = pStatement;
    }

    public String getSQLStatement() {
        return mSQLStatement;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

}