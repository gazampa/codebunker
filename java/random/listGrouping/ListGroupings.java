import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
public class ListGroupings{
	public static void main(String[] args){

		ArrayList<SingleListItem> listItems = new ArrayList<SingleListItem>();

		for ( int i=0;i<10;i++ ){
			SingleListItem singleItem = new SingleListItem(Integer.toString(i),Integer.toString(i%2));
			listItems.add( singleItem );
		}


		for(SingleListItem item : listItems){
			System.out.println(item.name + " : " + item.group);
		}

		organizeByGroup(listItems);

	}


	private static void organizeByGroup(ArrayList<SingleListItem> listItems){
		HashSet<String> groups = new HashSet<String>();
		ArrayList<ArrayList<SingleListItem>> listOfGroups= new ArrayList<ArrayList<SingleListItem>>();

		groups = getGroups(listItems);

		listOfGroups = aggregateIntoGroups(groups,listItems);

		for (ArrayList<SingleListItem> group : listOfGroups ){
			if ( group.size()>1 ){
				for (SingleListItem item: group){
					System.out.println(item.getName() + " : "+item.getGroup());
				}
			}
		}

	}

	private static HashSet<String> getGroups(ArrayList<SingleListItem> listItems){
		HashSet<String> groups = new HashSet<String>();
		for ( SingleListItem item : listItems ){
			if ( !item.group.equals("1") ){
				groups.add(item.getGroup());
			}
		}
		return groups;
	}

	private static ArrayList<ArrayList<SingleListItem>> aggregateIntoGroups(HashSet<String> groups,ArrayList<SingleListItem> listItems){
		ArrayList<ArrayList<SingleListItem>> listOfGroups= new ArrayList<ArrayList<SingleListItem>>();

		for (String group : groups){
			ArrayList<SingleListItem> groupList = new ArrayList<SingleListItem>();
			for (SingleListItem item : listItems){
				if ( group.equals(item.getGroup()) ){
					groupList.add(item);
				}
			}
			System.out.println("adding to listofgroups at key value " + group + " : " +groupList);
			listOfGroups.add(groupList);
		}

		return listOfGroups;
	}


}

/*		for ( String group : groups ){
			if (listOfGroups.containsKey(group)){
				ArrayList<SingleListItem> groupOutList = (ArrayList<SingleListItem>)listOfGroups.get(group);
				for (SingleListItem item : groupOutList){
					System.out.println(item.getName() + " : " + item.getGroup() + " : " + group);
				}
			}
		}*/