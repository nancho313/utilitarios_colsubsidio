package com.colsubsidio;

import com.colsubsidio.model.Beneficiario;
import com.colsubsidio.model.ValidadorDerechosLegacyResponse;
import com.colsubsidio.model.ValidadorDerechosResponse;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class ConsultarInformacionValidadorDerechos {

    public ValidadorDerechosResponse consultarInformacionBeneficiario(String idNum, String tipoId) {

        ValidadorDerechosResponse response = null;

        HttpURLConnection con = null;

        try {
            URL url = new URL("https://colsubsidio-prod.apigee.net/api/v2/afiliacion/validador?tipoId="+tipoId+"&numeroId=" + idNum);
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Authorization", "Bearer DfJkYGFShGQb0M3wKBPnOAeAou2P");
            //con.setRequestProperty("x-api-key", "CBBbHdCiLrdA81yCb4Q7UrolZsbj9UXa");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {

                content.append(inputLine);
            }

            in.close();

            response = new Gson().fromJson(content.toString(), ValidadorDerechosResponse.class);


        } catch (Exception e) {

            System.out.println("ERROR - " + idNum);
        } finally {

            if (con != null)
                con.disconnect();
        }

        return response;
    }

    public Beneficiario obtenerInformacionBeneficiario(ValidadorDerechosResponse validadorDerechosResponse, String numId) {

        Beneficiario beneficiario = null;

        if (validadorDerechosResponse != null && validadorDerechosResponse.getData() != null && validadorDerechosResponse.getData().size() > 0) {

            ValidadorDerechosResponse.Afiliado afiliado = validadorDerechosResponse.getData().get(0).getAfiliado();

            if (afiliado != null && afiliado.getNumeroDocumento() != null && afiliado.getNumeroDocumento().trim().equals(numId)) {

                beneficiario = new Beneficiario(afiliado.getPrimerNombre(), afiliado.getSegundoNombre(), afiliado.getPrimerApellido(), afiliado.getSegundoApellido());
            } else {

                List<ValidadorDerechosResponse.Pac> pacs = validadorDerechosResponse.getData().get(0).getPacs();

                if (pacs != null) {

                    for (ValidadorDerechosResponse.Pac pac : pacs) {

                        if (pac.getNumeroDocumento() != null && pac.getNumeroDocumento().trim().equals(numId)) {

                            beneficiario = new Beneficiario(pac.getPrimerNombre(), pac.getSegundoNombre(), pac.getApellido(), pac.getSegundoApellido());

                            break;
                        }
                    }
                }
            }
        }

        return beneficiario;
    }

    public ValidadorDerechosLegacyResponse consultarInformacionBeneficiarioLegacy(String idNum, String tipoId) {

        ValidadorDerechosLegacyResponse response = null;

        HttpURLConnection con = null;

        try {
            URL url = new URL("http://colsubsidio-prod.apigee.net/api/afiliacion/validador?tipoId="+tipoId+"&numeroId=" + idNum);
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
            //con.setRequestProperty("Authorization", "Bearer DfJkYGFShGQb0M3wKBPnOAeAou2P");
            con.setRequestProperty("x-api-key", "CBBbHdCiLrdA81yCb4Q7UrolZsbj9UXa");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {

                content.append(inputLine);
            }

            in.close();

            response = new Gson().fromJson(content.toString(), ValidadorDerechosLegacyResponse.class);


        } catch (Exception e) {

            System.out.println("ERROR - " + idNum);
        } finally {

            if (con != null)
                con.disconnect();
        }

        return response;
    }

    public Beneficiario obtenerInformacionBeneficiario(ValidadorDerechosLegacyResponse validadorDerechosResponse, String numId) {

        Beneficiario beneficiario = null;

        if (validadorDerechosResponse != null && validadorDerechosResponse.getData() != null && validadorDerechosResponse.getData().size() > 0) {

            ValidadorDerechosLegacyResponse.Afiliado afiliado = validadorDerechosResponse.getData().get(0).getAfiliado();

            if (afiliado != null && afiliado.getNumeroDocumento() != null && afiliado.getNumeroDocumento().trim().equals(numId)) {

                beneficiario = new Beneficiario(afiliado.getPrimerNombre(), afiliado.getSegundoNombre(), afiliado.getPrimerApellido(), afiliado.getSegundoApellido());
            } else {

                List<ValidadorDerechosLegacyResponse.Pac> pacs = validadorDerechosResponse.getData().get(0).getAfiliado().getPacs();

                if (pacs != null) {

                    for (ValidadorDerechosLegacyResponse.Pac pac : pacs) {

                        if (pac.getNumeroDocumento() != null && pac.getNumeroDocumento().trim().equals(numId)) {

                            beneficiario = new Beneficiario(pac.getPrimerNombre(), pac.getSegundoNombre(), pac.getApellido(), pac.getSegundoApellido());

                            break;
                        }
                    }
                }
            }
        }

        return beneficiario;
    }
}
