#!/usr/bin/env groovy

def call(service, tag) {
    try {
        println("Tag Docker image")
    } catch(Exception e) {
        println(e)
    }
}