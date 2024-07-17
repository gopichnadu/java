class Gym{ 
static String name="NewGym";
static String userName="Amulya";
static String gymEquipments[]={null,null,null,null,null,null,null,null};
static int index;
public static boolean createGymEquipments(String gymEquipment){
 boolean isGymEquipmentsName=false;
 if(gymEquipments!=null){
 gymEquipments[index]=gymEquipment;
 index++;
 isGymEquipmentsName=true;
 }else{
 
 System.out.println("the given name is not equipments name ,give currect name");
 }
 return isGymEquipmentsName;
 
 }
 public static void getGymEquipments(){
	 for(String gymEquipments: gymEquipments){
		 System.out.println(gymEquipments);
	 }
	 return;
 }

}