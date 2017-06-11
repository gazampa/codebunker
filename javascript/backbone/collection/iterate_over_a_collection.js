    for ( var i = 0; i < this.collection.models.length; i ++){

        console.log(this.collection.models[i].attributes.fieldName);

    }


    var html;

    this.collection.each(function(model) {
            html += model.toJSON();
    });
