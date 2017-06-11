Templates = {};

Templates.collectionTemplate = [
    "stations with LPG : " ,
        "<% _.each(collection, function(model){ %>" ,
            "<p><%=model.station_name %><br><%=model.street_address %><br><%=model.zip %><br><%=model.access_days_time %><br><%=model.station_phone %><br><%=model.longitude %> , <%=model.latitude %><br><%=model.cards_accepted %><br><%=model.fuel_type_code %></p>" ,
         "<% }); %>"
].join("\n").toString();