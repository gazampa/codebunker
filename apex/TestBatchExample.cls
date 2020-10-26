@isTest
public class TestBatchExample {
        
    public static testmethod void TestBatchExample() {

        List<Account> accounts = new List<Account>();
        
        for ( Integer i = 0; i < 5; i++ ) {

            accounts.add(new Account(name='Test ' + i ));

        }

        insert accounts;

        List<Contact> contacts = new List<Contact>();

        for (Integer i = 0; i < 500; i ++) {

            contacts.add( new Contact(lastname=''+i, AccountId=accounts.get(Math.mod(i,5)).id) );

        }

        insert contacts;

        Test.startTest();

        Database.executeBatch(new BatchExample());

        Test.stopTest();

        List<Contact> con = [ select id, firstname, lastname, accountid from Contact where lastname = null];

        System.assert(con.size() == 0 );

    }

}