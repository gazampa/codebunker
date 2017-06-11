var FuelListView = Backbone.View.extend({

  el : "div.fuelstop" ,

  //template : _.template(Templates.collectionTemplate) , // underscore template

  template : Handlebars.compile( HandleBs.collectionTemplate ) , // handlebar template

  initialize: function() {

    this.listenTo(this.collection, 'sync change', this.render);

    this.collection.fetch();

    this.render();

  } ,

  render: function() {

    var html =  JSON.stringify(this.collection);

    this.$el.empty().append( this.template( { collection: this.collection.toJSON() } ) );

    return this;

  }


});