package Lab2;
public class vagon2 extends vagon {
	
	private int Mesta[];

    public void PustojVagon(int NomerVagona) {
        NomerEtogoVagona=NomerVagona;
        Mesta = new int[ChisloMest];
        for (int i=0;i<ChisloMest;i++) Mesta[i]=0;
        // 0 - free
    }
	
	public void IzmenitxChisloMest(int NewChisloMest){
        super.ChisloMest = NewChisloMest;
    }
	
	public void ZanyatxMesto(int NomerMesta) {
        if(Mesta[NomerMesta-1]==1)
            System.out.println("��� ����� ��� ������: " + NomerMesta + " (����� �" + NomerEtogoVagona + ")!");
        Mesta[NomerMesta-1]=1;
        // 1 - zanyato
    }
	
	public void VagonInfo() {
		System.out.println("����� �" + NomerEtogoVagona);
		int SvobMest = 0;
		for(int i = 0; i < ChisloMest; i++){
			if(Mesta[i]!=1)
				SvobMest++;
		}
		System.out.println("����� ��������� ����: " + SvobMest);
		System.out.println("���������� � ��������� ������: ");
		for (int i=0;i<ChisloMest;i++){
			if((i+1)%4==1)
				System.out.print("[");
			
			if (Mesta[i]==0) System.out.print((i+1)+" ");
			if (Mesta[i]==1) System.out.print("# ");
			if((i+1)%4==0)
				System.out.print("]");
		
		}
		System.out.println("");
    }
}