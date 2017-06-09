FROM java:alpine
MAINTAINER ycwu
RUN mkdir /app
COPY dubbox-demo-provider-all.zip /app
RUN cd /app && unzip dubbox-demo-provider-all.zip \
	&& cd dubbox-demo-provider/scripts && chmod u+x start.sh && chmod u+x stop.sh

CMD ["/app/dubbox-demo-provider/scripts/start.sh"]