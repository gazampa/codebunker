var FuelListView = Backbone.View.extend({

  el : "body" ,

  initialize: function() {

    this.listenTo(this.model, 'sync change', this.render);

    this.model.fetch();

    this.render();

  } ,

  render: function() {

    var html =  JSON.stringify(this.model);

    this.$el.empty().append(html);

    return this;

  }


});