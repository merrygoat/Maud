SET java_path="C:/Program Files/Java/jdk-13.0.2/bin/java"
SET lib_path="libs/current"
SET build_dir="build"

%java_path% --add-opens java.base/java.net=ALL-UNNAMED -cp %build_dir%/Maud.jar;%lib_path%/ij.jar;%lib_path%/com.github.tschoonj.xraylib.jar;%lib_path%/commons-math.jar;%lib_path%/Examples.jar;%lib_path%/Files.jar;%lib_path%/Help.jar;%lib_path%/HTTPClient.jar;%lib_path%/Images.jar;%lib_path%/jdom.jar;%lib_path%/jgaec.jar;%lib_path%/jgap.jar;%lib_path%/jmol.jar;%lib_path%/jogl.all.jar;%lib_path%/joone-engine.jar;%lib_path%/miscLib.jar;%lib_path%/MySQL-ConnectorJ.jar;%lib_path%/nativewindow.all.jar;%lib_path%/newt.all.jar;%lib_path%/sqlite-jdbc.jar;%lib_path%/swingx.jar;%lib_path%/xgridagent.jar;%lib_path%/xgridlib.jar;%lib_path%/aparapi.jar;%lib_path%/rome.jar;%lib_path%/jdic.jar;%lib_path%/jdic_stub.jar com.radiographema.Maud -t -f 'C:/Users/Peter/Documents/maud/MAUD_batch_065_mac.ins'
