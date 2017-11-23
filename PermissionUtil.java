package com.mausam.weather.india.util;

import android.Manifest;
import android.content.pm.PackageManager;

public class PermissionUtil {

    public final static int MY_PERMISSIONS_REQUEST_LOCATION = 003;


    public static final String[] LOCATION_PERMISSIONS = {Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION};


    public static boolean verifyPermissions(int[] grantResults) {
        if (grantResults.length < 1) {
            return false;
        }

        for (int result : grantResults) {
            if (result != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

}
