public class TestPosition
{
    public static void main(String []args){
Position position=new Position();
assert position.estAssis()==false;
assert position.estDebout()==false;
assert position.estDehors()==true;
assert position.estInterieur()==false;
System.out.println(position.toString());
testDehors();
TestPosition tp=new TestPosition();
tp.testDehors2();
}
    static public void testDehors()
    {
	Position pos=new Position();
	assert pos.estAssis()==false;
	assert pos.estDebout()==false;
	assert pos.estDehors()==true;
	assert pos.estInterieur()==false;
	System.out.println(pos.toString());
    }
     public void testDehors2()
    {
	Position pos=new Position();
	assert pos.estAssis()==false;
	assert pos.estDebout()==false;
	assert pos.estDehors()==true;
	assert pos.estInterieur()==false;
	System.out.println(pos.toString());
    }
}
