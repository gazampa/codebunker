Templates = {};

HandleBs = {};

Templates.collectionTemplate = [

    "<h4>A Page of 100 Electric Car Charging Port Locations in Chicago : </h4>" ,
        "<% _.each(collection, function(model){ %>" ,
            "<p>" ,
            "<%=model.station_name %>" ,
            "<br><%=model.street_address %>" ,
            "<br><%=model.zip %>" ,
            "<br><%=model.access_days_time %>" ,
            "<br><%=model.station_phone %>" ,
            "<br><%=model.longitude %> , <%=model.latitude %>" ,
            "<br><%=model.cards_accepted %>" ,
            "<br><%=model.fuel_type_code %>" ,
            "<br>date last checked : <%=model.date_last_confirmed %>" ,
            "</p>" ,
         "<% }); %>"

].join("\n").toString();

HandleBs.collectionTemplate = [

    "<h4>A Page of 100 Electric Car Charging Port Locations in Chicago : </h4>" ,
    "{{#each collection}}" ,
        "<p>" ,
        "{{this.station_name}}" ,
        "<br>{{this.street_address}}" ,
        "<br>{{this.zip}}" ,
        "<br>{{this.access_days_time}}" ,
        "<br>{{this.station_phone}}" ,
        "<br>{{this.longitude}} , {{this.latitude}}" ,
        "<br>{{this.cards_accepted}}" ,
        "<br>{{this.fuel_type_code}}" ,
        "<br>date last checked : {{this.date_last_confirmed}}" ,
        "</p>" ,
    "{{/each}}"

].join("\n").toString();
