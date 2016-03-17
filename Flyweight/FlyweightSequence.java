/**
 * 
 * @author Koko
 * @startuml

    actor main
	
	 main -> Date : new
     loop eventList
     	main -> Math : random
     	alt random < 0.3	
            main -> EventSymbol : new
        else random  < 0.6
             main -> EventSymbol : new
        else 
        	main -> EventSymbol : new
        end
      end
      main -> Date : new
      main -> EventSymbol : new
      main -> EventSymbol : new
      main -> EventSymbol : new
      main -> Date : new
   	loop eventList
     	main -> EventSymbol : isEqualTo()
     	EventSymbol --> main : Boolean
        main -> EventSymbol : isEqualTo()
	    EventSymbol --> main : Boolean
	    main -> EventSymbol : isEqualTo()
	    EventSymbol --> main : Boolean
        	alt bool1
     		
        else bool2
	    else bool3
        end
      end
      main -> Date : new
      loop eventList
       main -> Math : random
     	alt random < 0.3	
            main -> EventSymbolFactory : newEventSymbol()
            EventSymbolFactory --> main : EventSymbol
        else random  < 0.6
              main -> EventSymbolFactory : newEventSymbol()
              EventSymbolFactory --> main : EventSymbol
        else 
        	 main -> EventSymbolFactory : newEventSymbol()
        	 EventSymbolFactory --> main : EventSymbol
        end
      end
      main -> Date : new
      main -> EventSymbolFactory : newEventSymbol()
      EventSymbolFactory --> main : EventSymbol
      
      main -> EventSymbolFactory : newEventSymbol()
      EventSymbolFactory --> main : EventSymbol
      
      main -> EventSymbolFactory : newEventSymbol()
      EventSymbolFactory --> main : EventSymbol
      
      main -> Date : new
      loop eventList
     	
     	alt eventList[i]==event1
     		
        else eventList[i]==event2
        
	    else eventList[i]==event3
	    
	   	end
	   end
	  main -> Date : new 

@enduml
 *
 */
public class FlyweightSequence {

}
