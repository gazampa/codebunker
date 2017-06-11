var FuelListView = Backbone.View.extend({

  el : "div.fuelstop" ,

  initialize: function() {

    this.listenTo(this.collection, 'sync change', this.render);

    this.collection.fetch();

    this.render();

  } ,

  render: function() {

    var html =  JSON.stringify(this.collection);

    this.$el.empty().append(html);

    return this;

  }


});