#!/usr/bin/env groovy

def call(service, tag) {
    try {
        println("Build Docker image")
    } catch(Exception e) {
        println(e)
    }
}