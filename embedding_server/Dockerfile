FROM python:3.10

WORKDIR /app

COPY requirements.txt .
COPY embedding_server.py .

RUN pip install --no-cache-dir -r requirements.txt

EXPOSE 5005

CMD ["python", "embedding_server.py"]
