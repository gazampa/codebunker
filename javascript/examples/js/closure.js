  function stateFlipper( initial ){
    
      var state = ( initial === undefined ) ? state = false : state = initial;

      state = !state; // flip method will return the opposite 
                      // so invert initial to get the right return 

      return {
                                          
          flipState : function( ) {

              return state = !state;
                                                              
          }
                                                                        
      }

  }

  var state = stateFlipper( );

  for ( var i = 0; i < 10; i++ ){

      console.log( state.flipState() );

  }
