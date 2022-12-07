/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fautapo.util;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import org.apache.tomcat.util.codec.binary.Base64;
import java.util.Calendar;

/**
 *
 * @author FNZABALETAA
 */
public class Util {

    private Util() {
    }

    public static String getStructureList(List<ListViewItem> lista, String value) {
        String structure = "";
        for (ListViewItem obj : lista) {
            if (obj.getId().equals(value)) {
                obj.setSelect(Boolean.TRUE);
                structure += obj.getFormat();
            } else {
                obj.setSelect(Boolean.FALSE);
                structure += obj.getFormat();
            }
        }
        return structure;
    }

    public static BufferedImage resize(BufferedImage bufferedImage, int newW, int newH) {
        int w = bufferedImage.getWidth();
        int h = bufferedImage.getHeight();
        BufferedImage bufim = new BufferedImage(newW, newH, bufferedImage.getType());
        Graphics2D g = bufim.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(bufferedImage, 0, 0, newW, newH, 0, 0, w, h, null);
        g.dispose();
        return bufim;
    }

    public static String esImagenModificado(String value, String comparar) {
        String valorretorno = "";
        if (value.contains(":")) {
            if (comparar.equals("image.png")) {
                valorretorno = value;
            } else {
                valorretorno = comparar;
            }
        } else {
            if (value.equals(comparar)) {
                valorretorno = value;
            } else {
                valorretorno = comparar;
            }
        }
        return valorretorno;
    }

    public static boolean isNullOrBlank(String param) {
        return param == null || param.trim().length() == 0;
    }

    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static String Imagen64(String value, String Directorio) throws IOException {
        String imagen = "";
        String scontentype = "";
        String rootPath = "";
        if (value.contains(";")) {
            String[] str = value.split(";");
            scontentype = str[0];
            rootPath = Directorio + File.separator + str[1];
        } else {
            scontentype = "image/png";
            rootPath = Directorio + File.separator + value;
        }

        File fnew = new File(rootPath);
        BufferedImage originalImage = ImageIO.read(fnew);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(originalImage, scontentype.replaceAll("image/", ""), baos);
        byte[] imageInByte = baos.toByteArray();
        imagen = "data:" + scontentype + ";base64," + Base64.encodeBase64String(imageInByte);

        return imagen;
    }

    public static String Imagen64(String value, String Directorio, int w, int h) throws IOException {
        String imagen = "";
        String scontentype = "";
        String rootPath = "";
        if (value.contains(";")) {
            String[] str = value.split(";");
            scontentype = str[0];
            rootPath = Directorio + File.separator + str[1];
        } else {
            scontentype = "image/png";
            rootPath = Directorio + File.separator + value;
        }

        File fnew = new File(rootPath);
        BufferedImage originalImage = ImageIO.read(fnew);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(resize(originalImage, w, h), scontentype.replaceAll("image/", ""), baos);
        byte[] imageInByte = baos.toByteArray();
        imagen = "data:" + scontentype + ";base64," + Base64.encodeBase64String(imageInByte);

        return imagen;
    }

    public static String fechaLiteral(Date fechaEmision) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaEmision);
        String mes = "";
        String dia = String.format("%0" + 2 + "d", Integer.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));
        switch (calendar.get(Calendar.MONTH) + 1) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                mes = "";
                break;
        }
        return dia + " de " + mes + ", " + calendar.get(Calendar.YEAR);
    }
}
