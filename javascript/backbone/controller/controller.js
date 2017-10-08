define(function(require) {
    var HelloModel = require('../model/model.js');
    var HelloView = require('../view/view');
    var $ = require('jquery');

    var model = new HelloModel({ id: document.location.search.slice(1) });
    model.fetch();

    $(document).ready(function() {
        var hello = new HelloView({
            el: $('.hello').first(),
            model: model
        });
    });

});



