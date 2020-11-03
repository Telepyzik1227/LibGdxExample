package com.mygdx.game.desktop

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector2

class TheBestGame : ApplicationAdapter() {
    // Ctrl + o
    lateinit var char : SpriteBatch
    lateinit var image : Texture
    var position = Vector2()

    override fun create() {
        char = SpriteBatch()
        image = Texture("char.png")
    }

    override fun render() {
        Gdx.gl.glClearColor(0.5f, 0f, 0.5f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            position.y = position.y + 200 * Gdx.graphics.deltaTime
        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            position.y = position.y - 200 * Gdx.graphics.deltaTime
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            position.x = position.x +  200 * Gdx.graphics.deltaTime
        }
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            position.x = position.x - 200 * Gdx.graphics.deltaTime
        }

        char.begin()
        char.draw(image, position.x,position.y)
        char.end()

    }

    override fun dispose() {

    }
}