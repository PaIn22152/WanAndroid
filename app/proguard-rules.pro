# 设置混淆的压缩比率 0 ~ 7
-optimizationpasses 5
# 混淆后类名都为小写   Aa aA
-dontusemixedcaseclassnames
# 指定不去忽略非公共库的类
-dontskipnonpubliclibraryclasses
#不做预校验的操作
-dontpreverify

# 这句话能够使我们的项目混淆后产生映射文件
# 包含有类名->混淆后类名的映射关系
-verbose

# 混淆采用的算法.
#-optimizations !code/simplification/arithmetic,!field/*,!class/merging


# 混淆时所采用的算法(谷歌推荐算法)
-optimizations !code/simplification/arithmetic,!code/simplification/cast,!field/*,!class/merging/*
#混淆后包名
#-repackageclasses androidy.newapi
# 提高优化步骤
-allowaccessmodification
# 将文件来源重命名为“SourceFile”字符串
-renamesourcefileattribute SourceFile
#保持异常不被混淆
-keepattributes Exceptions
#抛出异常时保留代码行号
-keepattributes SourceFile,LineNumberTable


#指定外部模糊字典
-obfuscationdictionary dictionary_package.txt
#指定class模糊字典
-classobfuscationdictionary dictionary_default.txt
#指定package模糊字典
-packageobfuscationdictionary dictionary_class.txt





##########################   Glide start    ########################
-keep public class * implements com.bumptech.glide.module.GlideModule
-keep public class * extends com.bumptech.glide.module.AppGlideModule
-keep public enum com.bumptech.glide.load.ImageHeaderParser$** {
  **[] $VALUES;
  public *;
}

# for DexGuard only
#-keepresourcexmlelements manifest/application/meta-data@value=GlideModule
##########################   Glide end    ########################


##########################   EventBus start    ########################

-keepattributes *Annotation*
-keepclassmembers class * {
    @org.greenrobot.eventbus.Subscribe <methods>;
}
-keep enum org.greenrobot.eventbus.ThreadMode { *; }

# And if you use AsyncExecutor:
#-keepclassmembers class * extends org.greenrobot.eventbus.util.ThrowableFailureEvent {
#    <init>(java.lang.Throwable);
#}

##########################   EventBus end    ########################


##########################   hms start    ########################
-keep class com.huawei.openalliance.ad.** { *; }
-keep class com.huawei.hms.ads.** { *; }
##########################   hms end    ########################



##########################   穿山甲广告 start    ########################
-keep class com.bytedance.sdk.openadsdk.** { *; }
-keep public interface com.bytedance.sdk.openadsdk.downloadnew.** {*;}
-keep class com.pgl.sys.ces.* {*;}
##########################   穿山甲广告 end    ########################


##########################   华为统计 start    ########################
-keep class com.hianalytics.android.**{*;}
-keep class com.huawei.updatesdk.**{*;}
-keep class com.huawei.hms.**{*;}
-keep class com.huawei.agconnect.**{*;}
-keep interface com.huawei.hms.analytics.type.HAEventType{*;}
-keep interface com.huawei.hms.analytics.type.HAParamType{*;}
##########################   华为统计 end    ########################


##########################   友盟 start    ########################
-keep class com.umeng.** {*;}

-keepclassmembers class * {
   public <init> (org.json.JSONObject);
}

-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}
##########################   友盟 end    ########################


##########################   test start    ########################
##########################   test end    ########################