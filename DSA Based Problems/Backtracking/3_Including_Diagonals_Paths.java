// Recursion tree for Including Diagonal paths 
("", 3,3)
├── D → ("D", 2,2)
│   ├── D → ("DD", 1,1) ✅
│   ├── V → ("DV", 1,2)
│   │   └── H → ("DVH", 1,1) ✅
│   └── H → ("DH", 2,1)
│       └── V → ("DHV", 1,1) ✅
│
├── V → ("V", 2,3)
│   ├── D → ("VD", 1,2)
│   │   └── H → ("VDH", 1,1) ✅
│   ├── V → ("VV", 1,3)
│   │   └── H → ("VVH", 1,2)
│   │       └── H → ("VVHH", 1,1) ✅
│   └── H → ("VH", 2,2)
│       ├── D → ("VHD", 1,1) ✅
│       ├── V → ("VHV", 1,2)
│       │   └── H → ("VHVH", 1,1) ✅
│       └── H → ("VHH", 2,1)
│           └── V → ("VHHV", 1,1) ✅
│
└── H → ("H", 3,2)
    ├── D → ("HD", 2,1)
    │   └── V → ("HDV", 1,1) ✅
    ├── V → ("HV", 2,2)
    │   ├── D → ("HVD", 1,1) ✅
    │   ├── V → ("HVV", 1,2)
    │   │   └── H → ("HVVH", 1,1) ✅
    │   └── H → ("HVH", 2,1)
    │       └── V → ("HVHV", 1,1) ✅
    └── H → ("HH", 3,1)
        └── V → ("HHV", 2,1)
            └── V → ("HHVV", 1,1) ✅


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  System.out.println( diagonalPath("",3,3)); 
	}
	static ArrayList<String>  diagonalPath(String p , int r , int c){

	    if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();

	        list.add(p);
	        return list;
	    }
	   ArrayList<String> list = new ArrayList<>();
        if(r >1 && c > 1){
         list.addAll(diagonalPath(p+"D",r-1,c-1));

        }
	    if(r>1){
	       list.addAll(diagonalPath(p+"V",r-1,c));
	    }
	    if(c>1){
	        list.addAll(diagonalPath(p+"H",r,c-1));

	    }
	    return list;
	}
}
