package kcl.ac.uk.xtext.generator

import kcl.ac.uk.xtext.videoAnnotationsDSL.AnnotatedVideo

class AnnotationCompletion {
	
	def getIDs(AnnotatedVideo video) {
		val list = newArrayList
		
		video.annotations.forEach([ann | list.add(ann.name)])
		return list
	}
	
	def getSenders(AnnotatedVideo video) {
		val list = newArrayList

		video.annotations.forEach([ann | list.add(ann.sender)])
		return list
	}
	
	def getMoves(AnnotatedVideo video) {
		val list = newArrayList
		
//		println(new VideoAnnotationsDSLParser().grammarAccess.moveRule.alternatives.eContents.toArray)
		video.annotations.forEach([ann | list.add(ann.type.type)])
		
		return list
	}
	
	def getScopes(AnnotatedVideo video) {
		val list = newArrayList
		
		video.annotations.forEach([ann | list.add(ann.scope.scope)])
		return list
	}
	
	def getFocus(AnnotatedVideo video) {
		val list = newArrayList
		
		video.annotations.forEach([ann | list.add(ann.focus.focus)])
		return list
	}
	
	def getContent(AnnotatedVideo video) {
		val list = newArrayList
		
		video.annotations.forEach([ann | list.add(ann.content)])
		return list
	}
	
	def getContentLabel(AnnotatedVideo video) {
		val list = newArrayList
		
		video.annotations.forEach([ann | if (ann.contentLabel != null) { list.add("\"" + ann.contentLabel + "\"") }])
		return list
	}
	
	def getTarget(AnnotatedVideo video) {
		val list = newArrayList
		
		video.annotations.forEach([ann | if (ann.target != null) { list.add(ann.target.name) }])
		return list
	}
}