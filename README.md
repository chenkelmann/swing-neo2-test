# Swing NEO2 Test #

You can download a binary version here: http://maven.henkelmann.eu/eu/henkelmann/swing-neo2-test/1.0/swing-neo2-test-1.0.jar

Very simple hello world Swing (well, actually only AWT) app that can be used for testing/debugging the neo2 java bug under X11.
(neo2 is an alternative keyboard layout, see: http://neo-layout.org/)

This is more or less the simplest possible app to demonstrate the behavior with.
(See http://wiki.neo-layout.org/ticket/129 for a description of the bug and https://github.com/chenkelmann/neo2-awt-hack for a possible workaround)

To start: 
    java -jar swing-neo2-test-1.0.jar

To start with the hack enabled:
    java java -Xbootclasspath/p:/path/to/neo2-awt-hack-0.x.jar -jar swing-neo2-test-1.0.jar

Prints some debug output while you type. 

