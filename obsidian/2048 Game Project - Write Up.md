---
excalidraw-plugin: parsed
tags:
  - excalidraw/zettel
excalidraw-open-md: true
modified: 2024-07-23
---


# 2048 Game Project 

Congratulation on conquering the AP exam! 

Now that we've grasped the basics of programming and Java, we have all the tools and knowledge we need to start building interesting things! In this project, you would re-create the popular game 2048 in Java 

![[2048 Game Project - Write Up|300]]

## Game Rules

Let's first familiarize ourselves with the game rules by playing a few games. Keep the following questions in mind as you play:

1. How does the game start?
<br><br><br>
2. What happens to the board when you press one of the four movement keys: up, down, left, and right?
<br><br><br><br>
3. When do new tiles get added to the board?
<br><br><br>
4. How does the game end? 
<br><br><br>
## Puzzle pieces

>  “The programmer, like the poet, works only slightly removed from pure thought-stuff. He builds his castles in the air, from air, creating by exertion of the imagination. Few media of creation are so flexible, so easy to polish and rework, so readily capable of realizing grand conceptual structures.” - Frederick P. Brooks Jr

Building a software product is like collecting and piecing together a bunch of puzzle pieces, except we fabricate the puzzle pieces themselves!

To provide some structure on this puzzle quest, I've wired together some basic pieces, namely the game logic for handling the user input and the game view for showing the board. You can find a reference to them on the back of this sheet

Your main task here is to implement the class `Board`. This class represents the state of a board during the course of play and contains method for updating the state. Those methods are used by both the game logic and the game view

## Checkpoints

Below is the recommended route for implementing the game

### Checkpoint 0: Implement the basic methods and members of `Board` class

At this checkpoint, you should implement the constructor and the methods `setBoard` and  `getBoard` 

Here, you'd decide whether you like to represent the board as a 1D array or a 2D array of digits/tiles. There're pros and cons to each approach, so pick the version make the most sense to you

### Checkpoint 1: Spawn new tiles

At this checkpoint, you should implement the method `spawnNewDigit`

The method would add a given digit/tile to the board (2 or 4). It should only add to an empty space on the board, and the empty space should be randomly chosen.

### Checkpoint 2: Move and Combine tiles

This checkpoint is the main crux of the game

You would implement the four movement handling methods:  `processLeftMove`,  `processRightMove`, `processUpMove`, and `processDownMove`

Those four methods would update the board when the user inputs the corresponding movement key

The key is to break up how the tiles are **combined** and **moved** in the respective rows and columns

### Checkpoint 3: Get Game State

Lastly, you would implement the method: `getGameState`

This would signal to game logic whether the game has been won, lost, or is still in progress

## Test, test, test

A big part of software development is testing. Because as the thing you're building increases in complexity, so are the amount of things that can go wrong. Testing ensures the code you write actually works

There're two ways you can test: **Manual tests** and **Unit tests**

### Manual Test

In manual test, you would run the game end to end and test the new code by manually providing the input

To do this, you'd un-comment the relevant portions in the class  `Game2048` (indicated by the comments), click `Run`, and play the game

### Unit Test

Many times, manual testing wouldn't spot problems early on in the system; this is because manual testing is end-to-end and cannot isolate each part of the system

**Unit Testing** is a key part to systematic testing. It comprises of test cases written for specific class components (`Board` class in this case) that are executed automatically. Those test cases would call the the class' methods with a set of *input* and expect it to generate a set of *output*

I've written few test cases that you should run for each part of the checkpoint, you can find how to run the unit tests in the back of this sheet. 

You can also try extending those test cases to cover more possible test scenarios



%%
# Text Elements
# Embedded files
cf3259c125b884ff35965ba855bdc122e7e38b9e: [[Pasted Image 20240506162149_060.png]]

# Drawing
```json
{
	"type": "excalidraw",
	"version": 2,
	"source": "https://github.com/zsviczian/obsidian-excalidraw-plugin/releases/tag/2.1.6",
	"elements": [
		{
			"id": "7_VZn0-zDzwqIo_vETAB0",
			"type": "image",
			"x": -280,
			"y": -220,
			"width": 240,
			"height": 310.81967213114757,
			"angle": 0,
			"strokeColor": "transparent",
			"backgroundColor": "transparent",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"seed": 1534269570,
			"version": 74,
			"versionNonce": 1233117534,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1715026921293,
			"link": null,
			"locked": false,
			"status": "pending",
			"fileId": "cf3259c125b884ff35965ba855bdc122e7e38b9e",
			"scale": [
				1,
				1
			]
		},
		{
			"type": "rectangle",
			"version": 1101,
			"versionNonce": 183385858,
			"isDeleted": true,
			"id": "uSU_Xfg6B4V4AmaNxpDYh",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -360,
			"y": -240,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "transparent",
			"width": 403.2131147540984,
			"height": 372.6666666666667,
			"seed": 1816003330,
			"groupIds": [
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1715026912847,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 1300,
			"versionNonce": 291154462,
			"isDeleted": true,
			"id": "xsLu2iI8DJS5vM3-fsMBA",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -323.3442622950821,
			"y": -221.67213114754082,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "#ffec99",
			"width": 60.03957037874506,
			"height": 60.03957037874506,
			"seed": 1900696258,
			"groupIds": [
				"Yu7jN0IGDeg48OOLuhQe_",
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "gIOhAwUq"
				}
			],
			"updated": 1715026912847,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 1472,
			"versionNonce": 1184042690,
			"isDeleted": true,
			"id": "gIOhAwUq",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -299.30414476928377,
			"y": -202.1592707744487,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "transparent",
			"width": 11.959335327148438,
			"height": 21.01384963256077,
			"seed": 2008459906,
			"groupIds": [
				"Yu7jN0IGDeg48OOLuhQe_",
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1715026912847,
			"link": null,
			"locked": false,
			"fontSize": 16.811079706048616,
			"fontFamily": 1,
			"text": "2",
			"rawText": "2",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "xsLu2iI8DJS5vM3-fsMBA",
			"originalText": "2",
			"lineHeight": 1.25
		},
		{
			"type": "rectangle",
			"version": 1066,
			"versionNonce": 1794881118,
			"isDeleted": true,
			"id": "nzDKKmjIxwGJOe3BVk-Hx",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -231.70491803278696,
			"y": -221.672131147541,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "transparent",
			"width": 61.0928961748634,
			"height": 61.0928961748634,
			"seed": 1715604034,
			"groupIds": [
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1715026912847,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 1066,
			"versionNonce": 478668418,
			"isDeleted": true,
			"id": "rNMc9bZmXShUvDIw9Nt1O",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -140.0655737704918,
			"y": -221.672131147541,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "transparent",
			"width": 61.0928961748634,
			"height": 61.0928961748634,
			"seed": 1942712834,
			"groupIds": [
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1715026912847,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 1167,
			"versionNonce": 1026636446,
			"isDeleted": true,
			"id": "lvkV1dXchi_fl4-Dvm5Ly",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -140.0655737704918,
			"y": -38.3934426229506,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "#fab005",
			"width": 60.03957037874506,
			"height": 60.03957037874506,
			"seed": 592568770,
			"groupIds": [
				"5dYMZg9UZDHAzGdifoQw1",
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "fBrIQAdu"
				}
			],
			"updated": 1715026912847,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 1350,
			"versionNonce": 1435223618,
			"isDeleted": true,
			"id": "fBrIQAdu",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -115.4207733223302,
			"y": -18.880582249858456,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "#fab005",
			"width": 10.749969482421875,
			"height": 21.01384963256077,
			"seed": 1072978306,
			"groupIds": [
				"5dYMZg9UZDHAzGdifoQw1",
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1715026912847,
			"link": null,
			"locked": false,
			"fontSize": 16.811079706048616,
			"fontFamily": 1,
			"text": "4",
			"rawText": "4",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "lvkV1dXchi_fl4-Dvm5Ly",
			"originalText": "4",
			"lineHeight": 1.25
		},
		{
			"type": "rectangle",
			"version": 1086,
			"versionNonce": 1856779998,
			"isDeleted": true,
			"id": "ieFujA5tMGZlhTCg4vCK2",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -231.70491803278696,
			"y": 53.24590163934448,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "#f08c00",
			"width": 60.03957037874506,
			"height": 60.03957037874506,
			"seed": 1492244802,
			"groupIds": [
				"mHENng9tAY0l95-fE31_E",
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "ZeDnrHB6"
				}
			],
			"updated": 1715026912847,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 1256,
			"versionNonce": 1249750530,
			"isDeleted": true,
			"id": "ZeDnrHB6",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -209.33608804360975,
			"y": 72.75876201243662,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "#f08c00",
			"width": 15.301910400390625,
			"height": 21.01384963256077,
			"seed": 1034510594,
			"groupIds": [
				"mHENng9tAY0l95-fE31_E",
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1715026912847,
			"link": null,
			"locked": false,
			"fontSize": 16.811079706048616,
			"fontFamily": 1,
			"text": "16",
			"rawText": "16",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "ieFujA5tMGZlhTCg4vCK2",
			"originalText": "16",
			"lineHeight": 1.25
		},
		{
			"type": "rectangle",
			"version": 1075,
			"versionNonce": 1744677662,
			"isDeleted": true,
			"id": "Y1h5uk_UbkqfdprCQm8lJ",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -48.42622950819663,
			"y": -221.672131147541,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "transparent",
			"width": 61.0928961748634,
			"height": 61.0928961748634,
			"seed": 2040131778,
			"groupIds": [
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1715026912847,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 1305,
			"versionNonce": 1616682434,
			"isDeleted": true,
			"id": "YWp3hNxVvTbUCIF9wZ88b",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -323.3442622950821,
			"y": -130.03278688524568,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "#ffec99",
			"width": 60.03957037874506,
			"height": 60.03957037874506,
			"seed": 1348634754,
			"groupIds": [
				"9c9DWpDIO7lYYUJlrSCaf",
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "99NastyD"
				}
			],
			"updated": 1715026912847,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 1482,
			"versionNonce": 1469486942,
			"isDeleted": true,
			"id": "99NastyD",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -299.30414476928377,
			"y": -110.51992651215355,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "transparent",
			"width": 11.959335327148438,
			"height": 21.01384963256077,
			"seed": 969025602,
			"groupIds": [
				"9c9DWpDIO7lYYUJlrSCaf",
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1715026912847,
			"link": null,
			"locked": false,
			"fontSize": 16.811079706048616,
			"fontFamily": 1,
			"text": "2",
			"rawText": "2",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "YWp3hNxVvTbUCIF9wZ88b",
			"originalText": "2",
			"lineHeight": 1.25
		},
		{
			"type": "rectangle",
			"version": 1331,
			"versionNonce": 71800194,
			"isDeleted": true,
			"id": "Xa4ZNP5VvQEPHgVfA5M3j",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -48.42622950819663,
			"y": 53.24590163934448,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "#ffec99",
			"width": 60.03957037874506,
			"height": 60.03957037874506,
			"seed": 1570230274,
			"groupIds": [
				"K6kilw8RYX7_Gl6t2VpyZ",
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "MJpVmggj"
				}
			],
			"updated": 1715026912847,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 1500,
			"versionNonce": 1976040350,
			"isDeleted": true,
			"id": "MJpVmggj",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -24.386111982398315,
			"y": 72.75876201243662,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "transparent",
			"width": 11.959335327148438,
			"height": 21.01384963256077,
			"seed": 266502082,
			"groupIds": [
				"K6kilw8RYX7_Gl6t2VpyZ",
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1715026912847,
			"link": null,
			"locked": false,
			"fontSize": 16.811079706048616,
			"fontFamily": 1,
			"text": "2",
			"rawText": "2",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "Xa4ZNP5VvQEPHgVfA5M3j",
			"originalText": "2",
			"lineHeight": 1.25
		},
		{
			"type": "rectangle",
			"version": 1072,
			"versionNonce": 662541634,
			"isDeleted": true,
			"id": "qz2PfmWr1xfe26uXDr47P",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -140.0655737704918,
			"y": -130.0327868852459,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "transparent",
			"width": 61.0928961748634,
			"height": 61.0928961748634,
			"seed": 1287731074,
			"groupIds": [
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1715026912847,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 1073,
			"versionNonce": 1220728798,
			"isDeleted": true,
			"id": "PUEUGPvUeoai4RSaxdows",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -48.42622950819663,
			"y": -130.0327868852459,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "transparent",
			"width": 61.0928961748634,
			"height": 61.0928961748634,
			"seed": 879949634,
			"groupIds": [
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1715026912848,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 1088,
			"versionNonce": 995990786,
			"isDeleted": true,
			"id": "YuaRZ35wKGshDO5okhLws",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -231.70491803278696,
			"y": -38.3934426229508,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "transparent",
			"width": 61.0928961748634,
			"height": 61.0928961748634,
			"seed": 123125506,
			"groupIds": [
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1715026912848,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 1081,
			"versionNonce": 1754803230,
			"isDeleted": true,
			"id": "5nh7r07WgJQfTGcYyHhl7",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -231.70491803278696,
			"y": -130.0327868852459,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "transparent",
			"width": 61.0928961748634,
			"height": 61.0928961748634,
			"seed": 569085634,
			"groupIds": [
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1715026912848,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 1097,
			"versionNonce": 761703618,
			"isDeleted": true,
			"id": "pTLolvX0U6BXDHcFlLbz5",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -323.3442622950821,
			"y": -38.3934426229508,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "transparent",
			"width": 61.0928961748634,
			"height": 61.0928961748634,
			"seed": 2026923650,
			"groupIds": [
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1715026912848,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 1100,
			"versionNonce": 1127807070,
			"isDeleted": true,
			"id": "0-KC-REUYXx5rYncTTsz0",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -323.3442622950821,
			"y": 53.24590163934438,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "transparent",
			"width": 61.0928961748634,
			"height": 61.0928961748634,
			"seed": 348407362,
			"groupIds": [
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1715026912848,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 1093,
			"versionNonce": 1664599170,
			"isDeleted": true,
			"id": "cYCs-99xoW_zxy7-OnSnB",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -140.0655737704918,
			"y": 53.24590163934438,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "transparent",
			"width": 61.0928961748634,
			"height": 61.0928961748634,
			"seed": 245771778,
			"groupIds": [
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1715026912848,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 1093,
			"versionNonce": 1618361502,
			"isDeleted": true,
			"id": "lJivxIkKs1emXCJqZhgAq",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -48.42622950819663,
			"y": -38.3934426229508,
			"strokeColor": "#1e1e1e",
			"backgroundColor": "transparent",
			"width": 61.0928961748634,
			"height": 61.0928961748634,
			"seed": 192224706,
			"groupIds": [
				"XvV7uQ9HZaQTVegdVArkA"
			],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1715026912848,
			"link": null,
			"locked": false
		}
	],
	"appState": {
		"theme": "light",
		"viewBackgroundColor": "#ffffff",
		"currentItemStrokeColor": "#1e1e1e",
		"currentItemBackgroundColor": "transparent",
		"currentItemFillStyle": "solid",
		"currentItemStrokeWidth": 2,
		"currentItemStrokeStyle": "solid",
		"currentItemRoughness": 1,
		"currentItemOpacity": 100,
		"currentItemFontFamily": 1,
		"currentItemFontSize": 36,
		"currentItemTextAlign": "left",
		"currentItemStartArrowhead": "arrow",
		"currentItemEndArrowhead": "arrow",
		"scrollX": 462.89344262295083,
		"scrollY": 278.91666666666663,
		"zoom": {
			"value": 2
		},
		"currentItemRoundness": "round",
		"gridSize": 20,
		"gridColor": {
			"Bold": "#C9C9C9FF",
			"Regular": "#EDEDEDFF"
		},
		"currentStrokeOptions": null,
		"previousGridSize": null,
		"frameRendering": {
			"enabled": true,
			"clip": true,
			"name": true,
			"outline": true
		},
		"objectsSnapModeEnabled": false
	},
	"files": {}
}
```
%%