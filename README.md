Description
-----------

This project is a collection of exercises from the book Functional Programming in Scala


Intellij Setup
--------------

1. Close Intellij if open
1. Delete the project iml file & idea folder if present
1. Open Intellij
1. Import project -> Create Project from Existing Sources
1. Deselect the Source directories
1. When the project opens, click Add root in the VCS popup
1. In project settings
    - Select project SDK (Java 1.8)
    - Click on Modules tab
    - Add new Scala module called after the project name,
    - Set the root project directory as the content root
    - Set src/test/scala as the Tests directory
    - Set src/main/scala as the Sources directory
    - Mark the remaining directories as Excluded
1. Open build.sbt and click 'import' on the popup
1. Now the Intellij is setup and you should be able to run tests
