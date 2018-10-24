# tower Defense - TeamSmart

## Position
* Xinyi Shao: Product Manager, Back End, Numerical Setup
* Bingkun Lei: Front End, Game Design, UX/UI Design
* Jiayun Yan: Chief UX/UI Designer 
* Likun Li: UI Design, Numerical Setup

## Scrum Development
5.3
* Presentation -> All

5.2
* Multi-thread optimization, game balance and testing -> Xinyi Shao
* Front-end optimization and testing —> Bingkun Lei
* Polished sprites -> Jiayun Yan
* Added opening animation -> Likun Li

5.1
* Finished GameLevel Generator, save and load game -> Xinyi Shao
* Finished Enemy View -> BingKun Lei
* Edited and polished elements sprites -> Jiayun Yan
* Designed equipments -> Likun Li

4.30
* Finished Game Level design and implementation -> Xinyi Shao
* Added money, skill slot in Battlefield -> Bingkun Lei
* Gif time statistic and added back animation for the enemy -> Jiayun Yan
* Edited opening animation -> Likun Li

4.29
* Finished skills and equipment for Tower -> Xinyi Shao
* Finished EquipmentView -> Bingkun Lei
* Edited and polished elements sprites -> Jiayun Yan
* Advanced numerical setup -> Likun Li

4.27/28
* Tested front-end program -> Bingkun Lei
* Basic numerical setup for Tower and Enemy-> Xinyi Shao
* Adjusted sprites properties -> Jiayun Yan
* Edited sounds effect -> Likun Li

4.25
* Finished Player class -> Xinyi Shao

4.23
* Finished and tested BattlefieldView with event-driven programming -> Bingkun Lei

4.22
* Finished and tested Battlefield, Tower and Enemy classes -> Xinyi Shao

4.18
* Finished editing Tower and Enemy sprites -> Jiayun Yan
* Started editing Tower skill sprites -> Jiayun Yan

4.16
* Finished demo for MainView and CommandCenterView -> Bingkun Lei
* Added sprites for elements and background -> Bingkun Lei

4.14
* Finished framework for Battlefield, Tower and Enemy Xinyi Shao

4.13
* Started back-end programming -> Xinyi Shao
* Started editing new sprites by Photoshop -> Jiayun Yan

4.10
* Finished demo for battle logic -> Xinyi Shao
* Finished testing and close the Taiga -> Xinyi Shao
* Uploaded elements sprites and BGM-> Bingkun Lei
* Started front-end programming -> Bingkun Lei

4.09
* Changed sprites -> Jiayun Yan

3.30
* Found sprites for battlefield and tower -> Jiayun Yan
* Started multi-thread programming for the battlefield -> Xinyi Shao

3.27
* High-level game framework design -> Xinyi Shao
* Drew UML and Sequence UML -> Likun Li

3.26
* Discussed high-level game design -> All

## Code Conventions
* Create and name a new directory under tower with lower case, use hyphen to connect words
```
assets/tower/pikachu/pikachu-sprites.gif
```
* Avoid absolute or relative path, use following code instead
```
String path = this.getClass().getClassLoader().getResource("fileName.png").toString();
```
* Put constant at beginning of class with upper case, use underscore to connect words
```
private static final double MOVE_SPEED = 20.0;
```
* Leave the JavaDoc comment when you added, changed code or found, fixed issue with author annotation
```
/**
 * Describe this class, method or what you did
 *
 * @author your name
 */
```
