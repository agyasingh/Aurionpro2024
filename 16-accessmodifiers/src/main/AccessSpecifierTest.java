

package main;

import com.aurionpro.model.ParentClass;
import com.aurionpro.model.SubClassSamePackage;
import com.aurionpro.model.AnotherClassSamePackage;
import com.aurionpro.test.SubClassDifferentPackage;

public class AccessSpecifierTest {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        SubClassSamePackage subSame = new SubClassSamePackage();
        AnotherClassSamePackage anotherSame = new AnotherClassSamePackage();
        SubClassDifferentPackage subDifferent = new SubClassDifferentPackage();

        System.out.println("ParentClass:");
        parent.display();

        System.out.println("\nSubClassSamePackage:");
        subSame.display();

        System.out.println("\nAnotherClassSamePackage:");
        anotherSame.display();

        System.out.println("\nSubClassDifferentPackage:");
        subDifferent.display();

        System.out.println("\nAccessing directly from main:");
        // System.out.println("Private: " + parent.privateVar); // Not accessible
        // System.out.println("Default: " + parent.defaultVar); // Not accessible
        // System.out.println("Protected: " + parent.protectedVar); // Not accessible
        System.out.println("Public: " + parent.publicVar);
    }
}
