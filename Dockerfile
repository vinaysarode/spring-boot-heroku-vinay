FROM getsentry/relay

RUN --rm -it                \
  -v $(pwd)/config/:/work/.relay/  \
  --entrypoint bash                \
  getsentry/relay                  \
  -c 'chown -R relay:relay /work/.relay'
  
 RUN --rm -it                \
  -v $(pwd)/config/:/work/.relay/  \
  getsentry/relay                  \
  config init
  
RUN --rm -it                \
  -v $(pwd)/config/:/work/.relay/  \
  -p 3000:3000                     \
  getsentry/relay                  \
  run
