public class TestJauge
{
public static void main(String args[]){

Jauge jauge=new Jauge(1000,200);
//200 non entrant dans l'intervalle.
assert jauge.estVert()==true;
assert jauge.estRouge()==false;

/*for(int a=0;a<900;++a)
    jauge.incrementer();
for(int b=0;b<900;++b)
jauge.decrementer();*/

/*Jauge jauge2=new Jauge(101,100);
jauge2.incrementer();
jauge2.incrementer();
assert jauge2.estRouge()==true;*/
System.out.println(jauge.toString());
TestJauge tj=new TestJauge();
tj.testDansIntervalle();
}
    public void testDansIntervalle()
    {
	Jauge jauge=new Jauge(12345,678);
	assert jauge.estVert()==true;
	assert jauge.estRouge()==false;
    }
}
