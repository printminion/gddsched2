@echo off

echo get brasil data

cd %~dp0

%~d0

start refreshcache_br.cmd
start refreshcache_ar.cmd
start refreshcache_ru.cmd
start refreshcache_cz.cmd
start refreshcache_jp.cmd
start refreshcache_au.cmd
start refreshcache_il.cmd
start refreshcache_de.cmd
