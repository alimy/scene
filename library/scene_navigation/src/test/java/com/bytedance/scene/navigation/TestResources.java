package com.bytedance.scene.navigation;


import androidx.annotation.NonNull;

import com.bytedance.scene.Scene;

public class TestResources {
    public static int getString(@NonNull Scene scene, @NonNull String name) {
        return scene.getResources().getIdentifier(name, "string", scene.requireActivity().getPackageName());
    }

    public static int getLayout(@NonNull Scene scene, @NonNull String name) {
        return scene.getResources().getIdentifier(name, "layout", scene.requireActivity().getPackageName());
    }

    public static int getStyle(@NonNull Scene scene, @NonNull String name) {
        return scene.getResources().getIdentifier(name, "style", scene.requireActivity().getPackageName());
    }

    public static int getId(@NonNull Scene scene, @NonNull String name) {
        return scene.getResources().getIdentifier(name, "id", scene.requireActivity().getPackageName());
    }
}
