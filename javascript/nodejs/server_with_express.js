var express = require('express');
var app = express();
var bodyParser = require('body-parser');
var urlencodedParser = bodyParser.urlencoded({ extended: false })
var fs = require('fs');

app.use(bodyParser.json());

app.use(function (req, res, next) {

    // Website you wish to allow to connect - null for flat files on your disk, ie, no origin server
    res.setHeader('Access-Control-Allow-Origin', 'null');

    // Request methods you wish to allow
    res.setHeader('Access-Control-Allow-Methods', 'GET, POST, OPTIONS, PUT, PATCH, DELETE');

    // Request headers you wish to allow
    res.setHeader('Access-Control-Allow-Headers', 'X-Requested-With,content-type');

    // Set to true if you need the website to include cookies in the requests sent
    // to the API (e.g. in case you use sessions)
    res.setHeader('Access-Control-Allow-Credentials', true);

    // Pass to next layer of middleware
    next();
});

app.get('/getLiverpool', function (req, res) {
        console.log( 'request from : ' +  ' : ' + req.headers.origin + ' : ' + req.originalUrl );
        fs.readFile( __dirname + '/json/' + 'liverpool.jsonarray', 'utf8', function (err, data) {
        res.end( data );
   });
})
app.get('/getChicago_Fire', function (req, res) {
        console.log( 'request from : ' +  ' : ' + req.headers.origin + ' : ' + req.originalUrl );
        fs.readFile( __dirname + '/json/' + 'chicago_fire.json', 'utf8', function (err, data) {
        res.end( data );
   });
})
app.get('/getDublin', function (req, res) {
        console.log( 'request from : ' +  ' : ' + req.headers.origin + ' : ' + req.originalUrl );
        fs.readFile( __dirname + '/json/' + 'dublin.json', 'utf8', function (err, data) {
        res.end( data );
   });
})
app.post('/postTeam', urlencodedParser, function (req, res) {
        // Prepare output in JSON format
        console.log( 'post request from : ' +  ' : ' + req.headers.origin + ' : ' + req.originalUrl );
        console.log( 'for : ' +  req.body.team);
        fs.readFile( __dirname + '/json/' + req.body.team + '.json', 'utf8', function (err, data) {
        res.end( data );
    });
})


var server = app.listen(8080, function () {

  var host = server.address().address
  var port = server.address().port

  console.log('nodejs listening at http://%s:%s', host, port)

})