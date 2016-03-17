/**
 * 
 * @author Koko
 * @startuml
 * class FlyweightComparisonExample {
		+void main(String[] arghssss)
	}
	class EventSymbolFactory {
		-Hashtable<String,EventSymbol> events
		+EventSymbol newEventSymbol(String evnt)
	}
	class EventSymbol {
		-String name
		+EventSymbol(String name)
		+String getName()
		+void print(String owner)
		+boolean isEqualTo(EventSymbol otherEvent)
	}
	
	FlyweightComparisonExample  --> EventSymbolFactory
	FlyweightComparisonExample  *-- EventSymbol
	EventSymbolFactory *--> EventSymbol
@enduml
 *
 */
public class FlyweightClass {

}
