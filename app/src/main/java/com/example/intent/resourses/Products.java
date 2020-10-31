package com.example.intent.resourses;

import com.example.intent.R;
import com.example.intent.model.Product;

import java.util.HashMap;

public class Products {

    public HashMap<String, Product[]> PRODUCT_MAP = new HashMap<>();

    private Products() {
        PRODUCT_MAP.put("Clothing", CLOTHING);
        PRODUCT_MAP.put("Smartphone", SMARTPHONES);
        PRODUCT_MAP.put("Television", TELEVISIONS);
        PRODUCT_MAP.put("Furniture", FURNITURE);
        PRODUCT_MAP.put("Utensil", UTENSILS);
        PRODUCT_MAP.put("Toiletry", TOILETRIES);
    }

    public static Products getInstance(){
        return new Products();
    }

    public static final Product BLACK_TROUSER = new Product("Black Trouser", R.drawable.black_trouser,
            "Clothing", 10.99);
    public static final Product BLEND_PERFORMANCE_T_SHIRT = new Product("Blend performance t shirt", R.drawable.blend_performance_tee,
            "Clothing", 10.99);
    public static final Product CHINO_SHORT = new Product("Chino Short", R.drawable.chino_short,
            "Clothing", 10.99);
    public static final Product LADIES_SHORT_SLEEVE_V_NECK = new Product("Ladies short sleeve V neck", R.drawable.ladies_short_sleeve_v_neck_tee,
            "Clothing", 10.99);
    public static final Product LADIES_TRIBLEND_T_SHIRT = new Product("Ladies tri-blend t-shirt", R.drawable.ladies_triblend_t_shirt,
            "Clothing", 10.99);
    public static final Product LADIES_T_SHIRT= new Product("Ladies t-shirt", R.drawable.ladies_tshirts,
            "Clothing", 10.99);
    public static final Product MICROFLEECE_JACKET = new Product("Microfleece jacket", R.drawable.microfleece_jacket,
            "Clothing", 10.99);
    public static final Product RAGLAN_T_SHIRTS = new Product("Raglan t-shirts", R.drawable.raglan_t_shirts,
            "Clothing", 10.99);
    public static final Product SHORT_SLEEVE_T_SHIRT = new Product("Short sleeve t-shirt", R.drawable.shortsleeve_t_shirts,
            "Clothing", 10.99);
    public static final Product SWIM_SHORT_BLUE = new Product("Swim short", R.drawable.swim_short_blue,
            "Clothing", 10.99);
    public static final Product TRI_BLEND_BASEBALL_RAGLAN = new Product("Tri-blend baseball raglan", R.drawable.black_trouser,
            "Clothing", 10.99);

    public static final Product IPHONE_12 = new Product("Iphone 12", R.drawable.iphone_12,
            "Smartphone", 10.99);
    public static final Product MOTOROLA_MOTO_G = new Product("Motorola moto G", R.drawable.motorola_moto_g,
            "Smartphone", 10.99);
    public static final Product NOKIA5 = new Product("Nokia 5.3", R.drawable.nokia_5,
            "Smartphone", 10.99);
    public static final Product ONE_PLUS_8_PRO = new Product("One plus 8 pro", R.drawable.one_plus_8_pro,
            "Smartphone", 10.99);
    public static final Product SAMSUNG_GALAXY_S10e = new Product("Samsung Galaxy S10e", R.drawable.samsung_galaxy_s10e,
            "Smartphone", 10.99);
    public static final Product SAMSUNG_GALAXY_S20 = new Product("Samsung Galaxy S20", R.drawable.samsung_galaxy_s20,
            "Smartphone", 10.99);
    public static final Product IPHONE_SE = new Product("Apple iphone SE", R.drawable.apple_iphone_se,
            "Smartphone", 10.99);
    public static final Product GOOGLE_PIXEL = new Product("Google pixel 4a", R.drawable.google_pixel_4a,
            "Smartphone", 10.99);

    public static final Product ICONIX_TV = new Product("Iconix TV", R.drawable.iconix_tv,
            "Television", 10.99);
    public static final Product GALAXY_TV = new Product("Iconix TV", R.drawable.galaxy_24_inch_tv,
            "Television", 10.99);
    public static final Product NOBEL_SMART_TV = new Product("Nobel smart TV", R.drawable.nobel_32_smart_tv,
            "Television", 10.99);
    public static final Product VITRON_TV = new Product("Vitron TV", R.drawable.vitron_tv,
            "Television", 10.99);

    public static final Product DISPLAY_UNIT = new Product("Display unit", R.drawable.display_unit,
            "Furniture", 10.99);
    public static final Product FABRIC_RECLINER = new Product("Fabric recliner", R.drawable.maria_fabric_recliner,
            "Furniture", 10.99);
    public static final Product DINING_SET = new Product("6-seater dining set", R.drawable.martin_6_seater_dining_set,
            "Furniture", 10.99);
    public static final Product TRITON_KING_BED = new Product("Triton king bed unit", R.drawable.triton_king_bed_with_2_night_stands,
            "Furniture", 10.99);

    public static final Product SS_HOT_POT = new Product("Stainless steel hot pot", R.drawable.stainless_steel_hot_pot,
            "Utensil", 10.99);
    public static final Product SS_KADHAI= new Product("Stainless steel kadhai", R.drawable.stainless_steel_kadhai,
            "Utensil", 10.99);
    public static final Product SS_POT = new Product("Stainless steel pot", R.drawable.stainless_steel_pot,
            "Utensil", 10.99);
    public static final Product SS_PRESSURE_COOKER = new Product("Stainless steel pressure cooker", R.drawable.stainless_steel_pressure_cooker,
            "Utensil", 10.99);
    public static final Product SS_TOPE = new Product("Stainless steel tope", R.drawable.stainless_steel_tope,
            "Utensil", 10.99);

    public static final Product TOOTHPASTE = new Product("Toothpaste", R.drawable.toothpaste,
            "Toiletry", 10.99);
    public static final Product BATHING_SOAP = new Product("Dettol bathing soap", R.drawable.bathing_soap,
            "Toiletry", 10.99);
    public static final Product MOUTH_WASH = new Product("Mouth wash", R.drawable.mouth_wash,
            "Toiletry", 10.99);
    public static final Product HAND_WASH = new Product("Dettol hand wash", R.drawable.dettol_handwash,
            "Toiletry", 10.99);
    public static final Product PETROLEUM_JELLY = new Product("Vaseline petroleum jelly", R.drawable.vaselin_petroleum_jelly,
            "Toiletry", 10.99);
    public static final Product BODY_LOTION = new Product("Nivea body lotion", R.drawable.nivea_body_lotion,
            "Toiletry", 10.99);

    public static final Product[] CLOTHING = {BLACK_TROUSER, BLEND_PERFORMANCE_T_SHIRT, CHINO_SHORT,
            LADIES_SHORT_SLEEVE_V_NECK , LADIES_TRIBLEND_T_SHIRT , LADIES_T_SHIRT,
            MICROFLEECE_JACKET,RAGLAN_T_SHIRTS ,SHORT_SLEEVE_T_SHIRT , SWIM_SHORT_BLUE ,TRI_BLEND_BASEBALL_RAGLAN};
    public static final Product[] SMARTPHONES = {IPHONE_12 ,MOTOROLA_MOTO_G ,NOKIA5 ,ONE_PLUS_8_PRO ,
            SAMSUNG_GALAXY_S10e ,SAMSUNG_GALAXY_S20 ,IPHONE_SE ,GOOGLE_PIXEL};
    public static final Product[] TELEVISIONS = {ICONIX_TV, GALAXY_TV, NOBEL_SMART_TV, VITRON_TV};
    public static final Product[] FURNITURE = {DISPLAY_UNIT, FABRIC_RECLINER, DINING_SET, TRITON_KING_BED};
    public static final Product[] UTENSILS = {SS_HOT_POT, SS_KADHAI, SS_POT, SS_PRESSURE_COOKER, SS_TOPE};
    public static final Product[] TOILETRIES = {TOOTHPASTE, BATHING_SOAP, MOUTH_WASH, HAND_WASH, PETROLEUM_JELLY, BODY_LOTION};
}
