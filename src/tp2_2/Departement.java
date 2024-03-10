package tp2_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Departement {
	private int idDep;
	Set<employe> LEmployes;
	
	public Departement(int idDep, int capacity) {
		this.idDep=idDep;
		LEmployes=new HashSet<employe>();
		}
	public void ajoutEmploye(employe E)
	{
		if(E.getCin()>0)
		{
			E.setIdDept(this.idDep);
			this.LEmployes.add(E);
		}
	}
	public void retirerEmploye(employe E)
	{
		LEmployes.remove(E);
	}
	public void afficheDep()
	{
		for(employe E:LEmployes)
		{
			System.out.println(E.toString());
		}
	}
	public boolean existeE(int cin)
	{
		for(employe E:LEmployes)
		{
			if(E.getCin()==cin)
				return true;
		}
		return false;
	}
	
	public employe getEmpSalMax()
	{ 
		TreeSet<employe> l=new TreeSet<>(this.LEmployes);
		return  l.first();
	}
	public int getIdDep() {
		return idDep;
	}
	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}
	public Set<employe> getLEmployes() {
		return LEmployes;
	}
	public void setLEmployes(Set<employe> lEmployes) {
		LEmployes = lEmployes;
	}
	
}
