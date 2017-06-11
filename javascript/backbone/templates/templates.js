Templates = {};

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