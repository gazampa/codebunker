import strategy.*;
class TestStrategy {
    public static void main(String[] args) {
        Context context;

        // Three contexts following different strategies
        context = new Context(new Add());
        int resultA = context.executeStrategy(3,4);

        context = new Context(new Subtract());
        int resultB = context.executeStrategy(3,4);

        context = new Context(new Multiply());
        int resultC = context.executeStrategy(3,4);

        System.out.println("Result A : " + resultA );
        System.out.println("Result B : " + resultB );
        System.out.println("Result C : " + resultC );
    }
}



// Version and Origin: Strategys Required - Pass Objects. Or make more stategies based on objects properties : Method instead of Class
//	- Relativity Case and No Instance - CaseAndNoInstance( Relativity_Case__c relCase, Instance__c instance )
//	- Relativity Case And Instance	- CaseAndInstance( Relativity_Case__c relCase, Instance__c instance )
//	- No Relativity Case And Instance - NoCaseAndInstance( Relativity_Case__c relCase, Instance__c instance )
//	- No Relativity Case and No Instance - NoCaseAndNoInstance( Relativity_Case__c relCase, Instance__c instance )