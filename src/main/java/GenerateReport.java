import com.trivago.cluecumber.core.CluecumberCore;
import com.trivago.cluecumber.engine.exceptions.CluecumberException;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class GenerateReport {
    public static void main(String[] args) throws CluecumberException {
        String jsonDirectory = "target/cucumber-report/";
        String reportDirectory = "target/cucumber-report/cluecumber_report";

        new CluecumberCore.Builder()
                .setCustomPageTitle("My cool report")
                .build()
                .generateReports(jsonDirectory, reportDirectory);
        // Créer un objet File
        File htmlFile = new File(reportDirectory + "/index.html" );

        // Vérifier si le bureau est pris en charge et si le fichier existe
        if (Desktop.isDesktopSupported() && htmlFile.exists()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                // Ouvrir le fichier HTML dans le navigateur par défaut
                desktop.browse(htmlFile.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Le bureau n'est pas pris en charge ou le fichier n'existe pas.");
        }
    }
}
