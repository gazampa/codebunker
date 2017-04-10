var http = require('http');
var fs = require('fs');
var url = require('url');

// Create a server
http.createServer( function (request, response) {
   // set cors headers - allow access from html file on local disk
    response.setHeader('Access-Control-Allow-Origin', 'null');
    response.setHeader('Access-Control-Request-Method', '*');
    response.setHeader('Access-Control-Allow-Methods', 'OPTIONS, GET', 'POST', 'DELETE', 'HEAD');
    response.setHeader('Access-Control-Allow-Headers', 'Content-Type');

    //use to return user information to return to client.
    var result;
    // notify client whats available
    var teamsCovered = ['liverpool', 'chicago_fire', 'dublin'];
    var team;

    console.log('http request url ' + url.parse(request.url).pathname );

    console.log('http request method ' + request.method);

    var queryPath = url.parse(request.url).pathname;

    // Controller Bloat - Controller as Router - Read the requested file content from file system
    if ( request.method === 'OPTIONS' ){
        response.end();
    }
    else if ( request.method==='GET'){
        console.log(' parsing get ');

        var queryPath = url.parse(request.url).pathname;

        // Print the url parameters to the console
        console.log('Request for ' + queryPath + ' received.');

        // if the request starts /get* - get the name of the team
        team = getTeam(queryPath);

        console.log('request looking for : ' + team);

     }
     else if ( request.method === 'POST'){ // parameter parsing and processing are coupled by the listener
        console.log(' parsing post '); // ---> add express in the middle
        var body = [];
        request.on('data', function(chunk) {
            body.push(chunk);
        }).on('end', function() {
            body = Buffer.concat(body).toString();
            (function process() { // try replacing with a call
                    console.log('post processing in listener with self invoking function here ' + body);
                    pdata = JSON.parse(body);
                    team = pdata.team;
                    console.log('request looking for : ' + team);
                    var filepath = './json/' + team + '.json';
                    getPlayersAndWriteResponse(filepath, writeResponse, response);
                    console.log(' no you cant ');
            })()
        }).on('error', function(err) {
            // This prints the error message and stack trace to `stderr`.
            console.error(err.stack);
        });

        console.log('post section executing here');

     }

    console.log('the team requested is ' + team);

    /** business section + response routing**/

    if ( teamsCovered.contains(team) && request.method !== 'OPTIONS' && request.method === 'GET'){
        console.log(' get business section ');
        var filepath = './json/' + team + '.json';
        var result = getPlayersAndWriteResponse(filepath, writeResponse, response);
        //writeResponse(result, response);
    } else if (teamsCovered.contains(team)  && request.method === 'POST'){
         console.log(' post business section ');
    }else{
        console.log(request.method);
        console.log(' default handling not defined but options, thats ok');
    }

    console.log('can i kick it : ' + team);

}).listen(8081);

// Console will print the message
console.log('Server running at http://127.0.0.1:8081/');

// parse the pathname to determine request type
var getTeam = function(path){
    var getUrl = /^\/get/;
    var result;
    console.log("Request for " + path + ' : ' + getUrl.test(path) );
    if ( getUrl.test(path)){
        result = path.replace('\/get', '').toLowerCase();
    }
    return result;
}

function getPlayers(fileName){
    var result;
    console.log(' doing this ' + fileName);
    fs.readFile(fileName, function (err, data) {
        if (err) {
            console.log(' doing this err' );
            console.log(err);
            result = JSON.stringify('{"result": "error reading file"}');
        }else {
            //file found
            console.log(' found this ' + fileName );
            result = data.toString();
        }
    });
    return result;
}

// read the file for a given parameter
function getPlayersAndWriteResponse(fileName, callback, response){
    var result;
    console.log(' doing this ' + fileName);
    fs.readFile(fileName, function (err, data) {
        if (err) {
            console.log(' doing this err' );
            console.log(err);
            result = JSON.stringify('{"result": "error reading file"}');
        }else {
            //file found
            console.log(' found this ' + fileName );
            result = data.toString();
            callback(result, response);
        }
    });

    return result;
}

function writeResponse(result, response){
    console.log('ok, so now im writing the response');
    response.writeHead(200, {'Content-Type': 'text/html'});
    response.write(result);
    response.end();
}

// if you put the method on the prototype, what namespace does it affect
function ArrayIncludes(target, array)
{

/* Caching array.length doesn't increase the performance of the for loop on V8 (and probably on most of other major engines) */

  for(var i = 0; i < array.length; i++)
  {
    if(array[i] === target)
    {
      return true;
    }
  }

  return false;
}

Array.prototype.contains = function(obj) {
    var i = this.length;
    while (i--) {
        if (this[i] === obj) {
            return true;
        }
    }
    return false;
}


function getFile(name, format, callback) {
    var self = this;

    if (!name) {
      return '';
    }

    var format = format ? format : 'html';
    var path = './app/views/actions/' + name + '.' + format;

    // callback handling
    var callback = (typeof callback === 'function') ? callback : function() {
    };

    fs.readFile(path, 'utf-8', function(error, content) {
    if (error) {
      throw ViewNotFoundException;
    } else {
      callback(content);
    }
    });
}