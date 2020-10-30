

public class GamesNeeded implements interfaceLol {




int Iron4 = 0;
int Iron3 = 100; 
int Iron2 = 200 ;
int Iron1 = 300 ;
int Bronze4 = 400; 
int Bronze3 = 500 ;
int Bronze2 = 600 ;
int Bronze1 = 700 ;
int Silver4 = 800 ;
int Silver3 = 900 ;
int Silver2 = 1000 ;
int Silver1 = 1100 ;
int Gold4 = 1200 ;
int Gold3 = 1300 ;
int Gold2 = 1400 ;
int Gold1 = 1500 ;
int Platinum4 = 1600; 
int Platinum3 = 1700 ;
int Platinum2 = 1800 ;
int Platinum1 = 1900 ;
int Diamond4 = 2000 ;
int Diamond3 = 2100 ;
int Diamond2 = 2200 ;
int Diamond1 = 2300 ;

public int totalLp(String rank, int lp) throws NoSuchFieldException{
    int totalLp;
    
    if (rank.equalsIgnoreCase("iron 4")){
        return totalLp = Iron4 + lp;
    }

    else if (rank.equalsIgnoreCase("iron 3")){
        return totalLp = Iron3 + lp;
    }

    else if (rank.equalsIgnoreCase("iron 2")){
        return totalLp = Iron2 + lp;
    }

    else if (rank.equalsIgnoreCase("iron 1")){
        return totalLp = Iron1 + lp;
    }

    else if (rank.equalsIgnoreCase("bronze 4")){
        return totalLp = Bronze4 + lp;
    }
    else if (rank.equalsIgnoreCase("bronze 3")){
        return totalLp = Bronze3 + lp;
    }
    else if (rank.equalsIgnoreCase("bronze 2")){
        return totalLp = Bronze2 + lp;
    }
    else if (rank.equalsIgnoreCase("bronze 1")){
        return totalLp = Bronze1 + lp;
    }

    else if (rank.equalsIgnoreCase("silver 4")){
        return totalLp = Silver4 + lp;
    }

    else if (rank.equalsIgnoreCase("silver 3")){
        return totalLp = Silver3 + lp;
    }

    else if (rank.equalsIgnoreCase("silver 2")){
        return totalLp = Silver2 + lp;
    }

    else if (rank.equalsIgnoreCase("silver 1")){
        return totalLp = Silver1 + lp;
    }

    else if (rank.equalsIgnoreCase("gold 4")){
        return totalLp = Gold4 + lp;
    }
    
    else if (rank.equalsIgnoreCase("gold 3")){
        return totalLp = Gold3 + lp;
    }
    
    else if (rank.equalsIgnoreCase("gold 2")){
        return totalLp = Gold2 + lp;
    }
   
    else if (rank.equalsIgnoreCase("gold 1")){
        return totalLp = Gold1 + lp;
    }

    else if (rank.equalsIgnoreCase("platinum 4")){
        return totalLp = Platinum4 + lp;
    }

    else if (rank.equalsIgnoreCase("platinum 3")){
        return totalLp = Platinum3 + lp;
    }

    else if (rank.equalsIgnoreCase("platinum 2")){
        return totalLp = Platinum2 + lp;
    }

    else if (rank.equalsIgnoreCase("platinum 1")){
        return totalLp = Platinum1 + lp;
    }

    else if (rank.equalsIgnoreCase("diamond 4")){
        return totalLp = Diamond4 + lp;
    }

    else if (rank.equalsIgnoreCase("diamond 3")){
        return totalLp = Diamond3 + lp;
    }
    
    else if (rank.equalsIgnoreCase("diamond 2")){
        return totalLp = Diamond2 + lp;
    }
    
    else if (rank.equalsIgnoreCase("diamond 1")){
        return totalLp = Diamond1 + lp;
    }

    else throw new NoSuchFieldException("The input rank is not found, check the spelling. EX: gold 1");
 
}

public int difOfLp(int yourLp, int wantedLp){
    return wantedLp - yourLp;
}


























    
}
