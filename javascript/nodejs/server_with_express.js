var express = require('express');
var app = express();
var bodyParser = require('body-parser');
var urlencodedParser = bodyParser.urlencoded({ extended: false })
var fs = require('fs');
const BASE_DIR = path.resolve(__dirname);
var RateLimit = require('express-rate-limit');
var limiter = RateLimit({
  windowMs: 15 * 60 * 1000, // 15 minutes
  max: 100, // max 100 requests per windowMs
});
app.use(limiter);
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
        var path = '/json/' + 'liverpool.jsonarray'; 
        var safePath = getSafePath(BASE_DIR, path);
        fs.readFile( safePath, 'utf8', function (err, data) {
        res.end( data );
   });
})
app.get('/getChicago_Fire', function (req, res) {
        console.log( 'request from : ' +  ' : ' + req.headers.origin + ' : ' + req.originalUrl );
        var path = '/json/' + 'chicago_fire.json';
        var safePath = getSafePath(BASE_DIR, path);
        fs.readFile( safePath, 'utf8', function (err, data) {
        res.end( data );
   });
})
app.get('/getDublin', function (req, res) {
        console.log( 'request from : ' +  ' : ' + req.headers.origin + ' : ' + req.originalUrl );
        var path = '/json/' + 'dublin.json';
        var safePath = getSafePath(BASE_DIR, path);        
        fs.readFile( safePath , 'utf8', function (err, data) {
        res.end( data );
   });
})
app.post('/postTeam', urlencodedParser, function (req, res) {
        // Prepare output in JSON format
        console.log( 'post request from : ' +  ' : ' + req.headers.origin + ' : ' + req.originalUrl );
        console.log( 'for : ' +  req.body.team);
        var path = '/json/' + req.body.team + '.json';
        var safePath = getSafePath(BASE_DIR, path);        
        fs.readFile( safePath, 'utf8', function (err, data) {
        res.end( data );
    });
})


var server = app.listen(8080, function () {

  var host = server.address().address
  var port = server.address().port

  console.log('nodejs listening at http://%s:%s', host, port)

})

function getSafePath(baseDir, pathInput) {
   
    // 1. Reject bad characters
    if (pathInput.includes('\0')) {
        throw new Error('Invalid path characters');
    }    

    // 2. Resolve to an absolute path
    const safePath = path.resolve(baseDir, relativeInput);

    // 3. Verify the path stays inside the base directory
    if (!safePath.startsWith(path.resolve(baseDir))) {
        throw new Error('Access Denied: Invalid path');
    }

    return safePath;
}
