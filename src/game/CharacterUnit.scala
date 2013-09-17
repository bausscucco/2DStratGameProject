package game

abstract class CharacterUnit extends Sprite{
    var team : Int = 0
    var xcoord : Int = 0
    var ycoord : Int = 0
    var hp_max : Int = 0
    var hp : Int = 0
	var movespeed : Int = 0
	var jumpheight : Int = 0
	var board : Board = _
	var weapons = new Array[Weapon](5)
	var selectedWeapon : Int = 0
	var faceR : Boolean = false
	
	/** type of selection:
	 *  0 = unselected
	 *  1 = selected for movement
	 *  2 = selecting weapon
	 */
	var selected : Int = 0
	
	/** moves the unit to the specified tile space if valid
	 * 
	 */
    def move{
	  
	}
    
    /** unit attacks depending on the weapon given
     * 
     */
    def attack(w : Weapon){
      
    }
    
    /** sets the unit's direction; true is right while left is false.
     *  The unit's direction is set to left by default
     * 
     * MODIFIES: this
     * EFFECTS: makes the unit face left or right
     */
    def faceDir(b:Boolean){
      faceR = b
    }
    
    def getTeamNum : Int = {
      team
    }
	
    def getX : Int = xcoord
    def getY : Int = ycoord
    def getSelectedWep: Int = selectedWeapon
    def getSelected: Int = selected
    def getWeapons: Array[Weapon] = weapons
    
    def setHp(maxhp : Int){
      hp_max = maxhp
      hp = maxhp
    }
    
    def setTeam(teamnum : Int){
      team = teamnum
    }
    
    def setBoard(b:Board){
      board = b
    }
    
    def setXandY(x: Int, y: Int){
      xcoord = x
      ycoord = y
    }
    
    def setSelected(sel : Int){
      selected = sel
    }
    
    def setSelectedWep(sel : Int){
      selectedWeapon = sel
    }
}