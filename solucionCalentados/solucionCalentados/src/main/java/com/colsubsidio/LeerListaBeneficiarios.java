package com.colsubsidio;

import com.colsubsidio.model.T2Beneficiario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerListaBeneficiarios {

    public List<T2Beneficiario> leerArchivo(String archivo){

        List<T2Beneficiario> registros = new ArrayList<>();
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(archivo);

            bufferedReader = new BufferedReader(fileReader);

            String linea = bufferedReader.readLine();

            while(linea != null){

                String[] infoSplit = linea.split(";");

                T2Beneficiario beneficiario = new T2Beneficiario(infoSplit[0], infoSplit[1], infoSplit[2]);

                registros.add(beneficiario);

                linea = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fileReader != null){

                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return registros;
    }
}
