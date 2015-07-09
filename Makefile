all:
	@echo "Updating site..."
	@git add .
	@git commit -m "Updated!"
	@git push origin master
	@echo "Done!"

info:
	@echo "Updated files:"
	@git status