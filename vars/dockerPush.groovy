#!/usr/bin/env groovy

def call(registry, service, tag) {
    try {
        println("Push Docker image")  
    } catch(Exception e) {
        println(e)
    }
}