function data() {

var payload = [  {
            "Id": "00U3D000001otyfsUAA",
            "RecordTypeId": "0121Y000001ABVEQA4",
            "Subject": "Today",
            "CreatedById": "0053D000001Ck62QAC",
            "WhatId": "0013D00000cK7LKQAZ",
            "OwnerId": "0053D000001Ck62QAC",
            "ActivityDate": "2019-09-03",
            "ActivityDateTime": "2019-09-03T15:40:00.000Z",
            "EndDateTime": "2019-09-03T16:43:00.000Z",
            "What": {
                "Name": "Super Test Company",
                "Id": "0013D00000Tm9pKQAZ"
            },"Owner": {
                "Id": "0053D000001cK62QAC"
            },
            "Consultant__r": {
                "Id": "0013D00000TcKLKQAZ"
            }
            },
            {
            "Id": "00U3D000001otCkUAI",
            "RecordTypeId": "0121Y000001QCKIQA4",
            "WhoId": "0033D00000WGQcKQAX",
            "WhatId": "0013D00000cK7LKQAZ",
            "Subject": "Super Event Time Meeting",
            "CreatedById": "0053D000001ck62QAC",
            "OwnerId": "0053D000001CK62QAC",
            "ActivityDate": "2019-09-05",
            "ActivityDateTime": "2019-09-05T17:00:00.000Z",
            "EndDateTime": "2019-09-05T18:00:00.000Z",
            "Who": {
                "Id": "0033D00000WGcKXQAX"
            },
            "What": {
                "Name": "Super Test Company",
                "Id": "0013D00000Tm9pKQAZ"
            },
            "Owner": {
                "Id": "0053D000001cK62QAC"
            }
            },
            {
            "Id": "00U3D000001mmNuUAI",
            "RecordTypeId": "0121Y000001IVVIQA4",
            "WhoId": "0033D00000Y3cKgQAJ",
            "WhatId": "0013D00000TcKLKQAZ",
            "Subject": "Super Event",
            "CreatedById": "0053D000001CK62QAC",
            "OwnerId": "0053D000001cK62QAC",
            "ActivityDate": "2019-09-04",
            "ActivityDateTime": "2019-09-04T17:00:00.000Z",
            "EndDateTime": "2019-09-04T18:00:00.000Z",
            "Who": {
                "Id": "0033D00000Y3cKgQAJ"
            },
            "What": {
                "Name": "Great Test Company",
                "Id": "0013D00000TcKLKQAZ"
            },
            "Owner": {
                "Id": "0053D000001cK62QAC"
            }
            },
            {
            "Id": "00U3D000001opcKUAI",
            "RecordTypeId": "0121Y00000cKSVEQA4",
            "Subject": "A Meeting",
            "CreatedById": "0053D000001McK2QAC",
            "OwnerId": "0053D000001MzcKQAC",
            "ActivityDate": "2019-08-02",
            "ActivityDateTime": "2019-08-02T21:00:00.000Z",
            "EndDateTime": "2019-08-02T22:00:00.000Z",
            "Owner": {
                "Id": "0053D000001Mz62QAC"
            },
            "Consultant__r": {
                "Id": "0013D00000TcKLKQAZ"
            }
            },
            {
            "Id": "00U3D000001kFwwUAI",
            "RecordTypeId": "0121Y000001FwVIQA4",
            "WhoId": "0033D00000WFwxVQAX",
            "WhatId": "0013D00000e3Fw0QAA",
            "Subject": "Amazing Day 3-01",
            "CreatedById": "0053D0000Fws3jVQAQ",
            "OwnerId": "0053D000001MzFwQAC",
            "ActivityDate": "2019-03-01",
            "ActivityDateTime": "2019-03-21T17:00:00.000Z",
            "EndDateTime": "2019-03-01T18:00:00.000Z",
            "Who": {
                "Id": "0033D00000WGFwVQAX"
            },
            "What": {
                "Name": "Boring Company",
                "Id": "0013D00000eFw0QAA"
            },
            "Owner": {
                "Id": "0053D000001Fw62QAC"
            }
        } ];

        return {
            
            getPayload : function (){

            return payload;
            
            }

        }

}
