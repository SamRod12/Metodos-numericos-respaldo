import math
import random
import pygame
from pygame.locals import *
import tkinter as tk
import os
import sys
from tkinter import messagebox

class cube(object):
    rows = 25
    w = 500

    def __init__(self, start, dirnx=1, dirny=0, color=(255, 0, 0)):
        self.pos = start
        self.dirnx = 1
        self.dirny = 0
        self.color = color

    def move(self, dirnx, dirny):
        self.dirnx = dirnx
        self.dirny = dirny
        self.pos = (self.pos[0] + self.dirnx, self.pos[1] + self.dirny)

    def draw(self, surface):
        dis = self.w // self.rows
        i = self.pos[0]
        j = self.pos[1]

        pygame.draw.rect(surface, self.color, (i * dis + 1, j * dis + 1, dis - 2, dis - 2))

class snake(object):
    body = []
    turns = {}

    def __init__(self, color, pos):
        self.color = color
        self.head = cube(pos)
        self.body.append(self.head)
        self.dirnx = 0
        self.dirny = 1

    def move(self):
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()

            keys = pygame.key.get_pressed()

            for key in keys:
                if keys[pygame.K_LEFT]:
                    self.dirnx = -1
                    self.dirny = 0
                    self.turns[self.head.pos[:]] = [self.dirnx, self.dirny]

                elif keys[pygame.K_RIGHT]:
                    self.dirnx = 1
                    self.dirny = 0
                    self.turns[self.head.pos[:]] = [self.dirnx, self.dirny]

                elif keys[pygame.K_UP]:
                    self.dirnx = 0
                    self.dirny = -1
                    self.turns[self.head.pos[:]] = [self.dirnx, self.dirny]

                elif keys[pygame.K_DOWN]:
                    self.dirnx = 0
                    self.dirny = 1
                    self.turns[self.head.pos[:]] = [self.dirnx, self.dirny]

        for i, c in enumerate(self.body):
            p = c.pos[:]
            if p in self.turns:
                turn = self.turns[p]
                c.move(turn[0], turn[1])
                if i == len(self.body) - 1:
                    self.turns.pop(p)
            else:
                if c.dirnx == -1 and c.pos[0] <= 0:
                    menuf(len(s.body))

                elif c.dirnx == 1 and c.pos[0] >= c.rows - 1:
                    menuf(len(s.body))

                elif c.dirny == 1 and c.pos[1] >= c.rows - 1:
                    menuf(len(s.body))

                elif c.dirny == -1 and c.pos[1] <= 0:
                    menuf(len(s.body))

                else:
                    c.move(c.dirnx, c.dirny)

    def reset(self, pos):
        self.head = cube(pos)
        self.body = []
        self.body.append(self.head)
        self.turns = {}
        self.dirnx = 0
        self.dirny = 1

    def addCube(self):
        tail = self.body[-1]
        dx, dy = tail.dirnx, tail.dirny

        if dx == 1 and dy == 0:
            self.body.append(cube((tail.pos[0] - 1, tail.pos[1])))
        elif dx == -1 and dy == 0:
            self.body.append(cube((tail.pos[0] + 1, tail.pos[1])))
        elif dx == 0 and dy == 1:
            self.body.append(cube((tail.pos[0], tail.pos[1] - 1)))
        elif dx == 0 and dy == -1:
            self.body.append(cube((tail.pos[0], tail.pos[1] + 1)))

        self.body[-1].dirnx = dx
        self.body[-1].dirny = dy

    def draw(self, surface):
        for i, c in enumerate(self.body):
            if i == 0:
                c.draw(surface)
            else:
                c.draw(surface)

def redrawWindow(surface):
    global rows, width, s, snack
    surface.fill((0, 0, 0))
    s.draw(surface)
    snack.draw(surface)
    pygame.display.update()


def randomSnack(rows, item):
    positions = item.body
    while True:
        x = random.randrange(rows)
        y = random.randrange(rows)
        if len(list(filter(lambda z: z.pos == (x, y), positions))) > 0:
            continue
        else:
            break
    return (x, y)


def menu():
    global rows, width, s, snack
    width = 500
    rows = 25
    pantalla = pygame.display.set_mode((width, width))
    fuente = pygame.font.Font(None, 30)
    titulo = pygame.font.Font(None, 40)
    reloj = pygame.time.Clock()
    men = True
    selected = "start"
    while men:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                quit()
            if event.type == pygame.KEYDOWN:
                if event.key == pygame.K_UP:
                    selected = "start"
                elif event.key == pygame.K_DOWN:
                    selected = "quit"
                if event.key == pygame.K_RETURN:
                    if selected == "start":
                        main()
                    if selected == "quit":
                        pygame.quit()
                        quit()

        pantalla.fill((15,111,129))
        title = titulo.render("Snake Game", True, (0,0,0))
        if selected == "start":

            text_start = fuente.render("Comenzar-", True, (0,0,0))
        else:
            text_start = fuente.render("Comenzar", True, (0,0,0))
        if selected == "quit":

            text_quit = fuente.render("Salir-", True, (0,0,0))
        else:
            text_quit = fuente.render("Salir", True, (0,0,0))
        title_rect = title
        start_rect = text_start
        quit_rect = text_quit
        pantalla.blit(title_rect, [150, 25])
        pantalla.blit(text_start, [180, 100])
        pantalla.blit(text_quit, [200, 200])
        pygame.display.update()
        reloj.tick(0)


def menuf(puntos):
    global width, rows, s, snack
    width = 500
    rows = 25

    pantalla = pygame.display.set_mode((width, width))
    fuente = pygame.font.Font(None, 25)
    titulo = pygame.font.Font(None, 40)
    reloj = pygame.time.Clock()
    men = True
    selected = "start"
    while men:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                quit()
            if event.type == pygame.KEYDOWN:
                if event.key == pygame.K_UP:
                    selected = "start"
                elif event.key == pygame.K_DOWN:
                    selected = "quit"
                if event.key == pygame.K_RETURN:

                    if selected == "quit":
                        pygame.quit()
                        quit()

        pantalla.fill((50,50,50))
        textoPuntos = "Puntuacion: "+str(puntos)
        title1 = fuente.render(textoPuntos, True, (200, 200, 200))
        title2 = titulo.render("Game Over ", True, (200,200,200))
        if selected == "quit":
            text_quit = fuente.render("SALIR-", True, (200,200,200))
        else:
            text_quit = fuente.render("SALIR", True, (200,200,200))
        title1_rect = title1
        title2_rect = title2

        pantalla.blit(title2_rect, [170, 25])
        pantalla.blit(title1_rect, [170, 100])
        pantalla.blit(text_quit, [30, 450])
        pygame.display.update()
        s.reset((10, 10))
        reloj.tick(0)


def main():

    global width, rows, s, snack
    width = 500
    rows = 25
    pantalla = pygame.display.set_mode((width, width))
    s = snake((255, 0, 0), (10, 10))
    snack = cube(randomSnack(rows, s), color=(0, 228, 255))
    flag = True
    clock = pygame.time.Clock()

    while flag:
        pygame.time.delay(50)
        clock.tick(10)
        s.move()
        if s.body[0].pos == snack.pos:
            s.addCube()
            snack = cube(randomSnack(rows, s), color=(0, 228, 255))

        for x in range(len(s.body)):
            if s.body[x].pos in list(map(lambda z: z.pos, s.body[x + 1:])):
                menuf(len(s.body))

                break

        redrawWindow(pantalla)

if __name__ == '__main__':
    pygame.init()
    menu()
    main()
