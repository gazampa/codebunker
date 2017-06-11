var FuelStopModel = Backbone.Model.extend({

    urlRoot: 'https://data.cityofchicago.org/resource/f7f2-ggz5.json',

    url: function() { return this.urlRoot + '?'; },

});
