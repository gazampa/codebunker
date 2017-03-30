import java.math.BigDecimal;

public class TestStringBuilder{

	public static void main(String[] args){

		String[] parameters = {"100","200"};

		StringBuilder parameterString = new StringBuilder();

		int index = 0;

		String table = "lr";
		String column = "zip";


		System.out.println(parameters.length);

                if (parameters != null) {
                    if (parameters.length == 0) {
                        //parameterString.append("");
                    } else if (parameters.length == 1) {
                        parameterString.append("AND (");
                        parameterString.append(table);
                        parameterString.append(".");
                        parameterString.append(column);
                        parameterString.append(" = '");
                        parameterString.append(parameters[0]);
                        parameterString.append("'");
                        parameterString.append(") ");
                    } else if (parameters.length > 1) {
                        parameterString.append("AND (");
                        for (String parameter : parameters) {
                            index++;
                            parameterString.append(table);
                            parameterString.append(".");
                            parameterString.append(column);
                            parameterString.append(" = '");
                            parameterString.append(parameter);
                            if (index < (parameters.length ))
                                parameterString.append("' OR ");
                        }

                        parameterString.append("') ");
                    }
                }

		System.out.println(parameterString.toString());

		BigDecimal client = new BigDecimal("32");
		System.out.println( client.toString() );

	}

}